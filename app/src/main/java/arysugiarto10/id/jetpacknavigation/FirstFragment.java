package arysugiarto10.id.jetpacknavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class FirstFragment extends Fragment {
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       return
               inflater.inflate(R.layout.fragment_first, container, false);
   }
   @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
       super.onViewCreated(view, savedInstanceState);

       final Bundle bundle = new Bundle();
       bundle.putBoolean("test_boolean", true);

       final NavController navController = Navigation.findNavController(getActivity(),R.id.my_nav_host_fragment);

//       View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.my_nav_host_fragment);

       Button button = view.findViewById(R.id.button_frag1);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               navController.navigate(R.id.action_firstFragment_to_seconFragment,bundle);
           }
       });
   }
}
