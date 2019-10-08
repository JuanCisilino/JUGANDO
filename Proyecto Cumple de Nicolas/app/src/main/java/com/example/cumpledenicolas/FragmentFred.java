package com.example.cumpledenicolas;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFred extends Fragment {

    private ImageView imagenFoto;
    private ImageButton botonClick;

    private final String CARPETA_RAIZ = "Mis_imagenes/";
    private final String RUTA_IMAGEN = CARPETA_RAIZ + "mis fotos";

    //setear imagen
    String path;

    View view;


    public FragmentFred() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_fragment_fred, container, false);
        imagenFoto = view.findViewById(R.id.imagenFragmentFred);
        botonClick = view.findViewById(R.id.imageButtonClick);

        botonClick.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Tomar_foto();
            }
        });


        return view;

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void Tomar_foto() {
        File fileImagen = new File(Environment.getExternalStorageState(),RUTA_IMAGEN);
        boolean isCreado =  fileImagen.exists();
        String nombreImagen = "";

        if (isCreado = false) {
            isCreado = fileImagen.mkdirs();
        }
        if (isCreado = true) {
            nombreImagen = (System.currentTimeMillis()/1000)+".jpg";
        }

        path = Environment.getDataDirectory() + File.separator+RUTA_IMAGEN+File.separator+nombreImagen;

        File imagen = new File(path);

        Intent intent = null;
        intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        intent.putExtra(MediaStore.EXTRA_MEDIA_FOCUS, imagen);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imagen);

        startActivityForResult(intent, 10);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case 10 :
                    MediaScannerConnection.scanFile(getActivity(), new String[]{path}, null, new MediaScannerConnection.OnScanCompletedListener() {
                        @Override
                        public void onScanCompleted(String s, Uri uri) {
                            Log.i("Ruta de almacenamiento", "path: "+ path);
                        }
                    });

                    Bitmap bitmap = BitmapFactory.decodeFile(path);
                    imagenFoto.setImageBitmap(bitmap);
                    Toast.makeText(getActivity(),"Foto Tomada!!", Toast.LENGTH_LONG).show();

                    break;

            }
        }
    }
}
