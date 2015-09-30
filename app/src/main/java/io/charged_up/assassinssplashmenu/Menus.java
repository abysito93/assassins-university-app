package io.charged_up.assassinssplashmenu;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Menus.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Menus#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Menus extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
       // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_menus, container, false);
   }
}
