/*
 * FragmentAboutDialog - Java Class for Android
 * Created by G.Capelli (BasicAirData) on 26/7/2016
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package eu.basicairdata.graziano.gpslogger;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;


public class FragmentUser extends DialogFragment {






    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        View viewInflated = LayoutInflater.from(getContext()).inflate(R.layout.fragment_user, (ViewGroup) getView(), false);
        final EditText email = (EditText) viewInflated.findViewById(R.id.email);
        final EditText input = (EditText) viewInflated.findViewById(R.id.username);


        builder.setView(viewInflated);

        SharedPreferences saved=getActivity().getSharedPreferences("login",0);
        if(saved.contains("name"))
            input.setText(saved.getString("name",""));
        if(saved.contains("email"))
            email.setText(saved.getString("email",""));



//////////////                    AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
// ...Irrelevant code for customizing the buttons and title
        //////////////////////////    LayoutInflater inflater = this.getLayoutInflater();
        //////////////////////////    View dialogView = inflater.inflate(R.layout.fragment_user, null);
                //////////////////////////   dialogBuilder.setView(dialogView);//////////////////////////



                builder.setPositiveButton("Save Changes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                     ///   EditText editText = (EditText) getView().findViewById(R.id.username);

                        String str = input.getText().toString();

                        String emailstr = email.getText().toString();

                        Toast.makeText(getActivity(), str,
                                Toast.LENGTH_SHORT).show();

                        ((GPSApplication)getActivity().getApplication()).saveName(str,emailstr);


                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        FragmentUser.this.getDialog().cancel();
                    }
                });










        return builder.create();
        }




}
