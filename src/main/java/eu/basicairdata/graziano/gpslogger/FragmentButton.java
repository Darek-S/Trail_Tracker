/*
 * FragmentTrack - Java Class for Android
 * Created by G.Capelli (BasicAirData) on 4/6/2016
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
///////////////SZABI EDIT///////////////////////////////////////////////////////////
package eu.basicairdata.graziano.gpslogger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;


public class FragmentButton extends Fragment {


    private String FOverallDirection = "";



    public FragmentButton() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recording_buttons, container, false);


        ///////////////////////////////////////////////////// SZABI EDIT/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////BUTTONS////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////RedTrail///////////////////////////////////////////////////////////
        ToggleButton toggle1 = (ToggleButton) view.findViewById(R.id.redTrail);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setRed(true);//Darek edit


                } else {


                    ((GPSApplication)getActivity().getApplication()).setRed(false);//Darek edit
                }
            }
        });


        /////////////////////////////////////////////////////////////BlueTrail///////////////////////////////////////////////////////////
        final ToggleButton toggle2 = (ToggleButton) view.findViewById(R.id.blueTrail);
        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setBlue(true);//Darek edit
                } else {


                    ((GPSApplication)getActivity().getApplication()).setBlue(false);//Darek edit
                }
            }
        });
/////////////////////////////////////////////////////////////GreenTrail///////////////////////////////////////////////////////////
        ToggleButton toggle3 = (ToggleButton) view.findViewById(R.id.greenTrail);
        toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setGreen(true);//Darek edit
                } else {


                    ((GPSApplication)getActivity().getApplication()).setGreen(false);//Darek edit
                }
            }
        });
        /////////////////////////////////////////////////////////////YellowTrail///////////////////////////////////////////////////////////
        ToggleButton toggle4 = (ToggleButton) view.findViewById(R.id.yellowTrail);
        toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setYellow(true);//Darek edit
                } else {


                    ((GPSApplication)getActivity().getApplication()).setYellow(false);//Darek edit
                }
            }
        });
////////////////////////////////Skiing///////////////////////
        ToggleButton toggle5 = (ToggleButton) view.findViewById(R.id.redSki);
        toggle5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setSkiired(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setSkiired(false);
                }
            }
        });
        ToggleButton toggle6 = (ToggleButton) view.findViewById(R.id.blueSki);
        toggle6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setSkiiblue(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setSkiiblue(false);
                }
            }
        });
        ToggleButton toggle7 = (ToggleButton) view.findViewById(R.id.greenSki);
        toggle7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setSkiigreen(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setSkiigreen(false);
                }
            }
        });
        ToggleButton toggle8 = (ToggleButton) view.findViewById(R.id.whiteSki);
        toggle8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setSkiiwhite(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setSkiiwhite(false);
                }
            }
        });

        //////////////////////////////////////////////////////////////////////////////////Bike///////////////////////

        ToggleButton toggle9 = (ToggleButton) view.findViewById(R.id.redBike);
        toggle9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setbikred(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setbikred(false);
                }
            }
        });
        ToggleButton toggle10 = (ToggleButton) view.findViewById(R.id.blueBike);
        toggle10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setbikeblue(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setbikeblue(false);
                }
            }
        });
        ToggleButton toggle11 = (ToggleButton) view.findViewById(R.id.greenBike);
        toggle11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setbikegreen(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setbikegreen(false);
                }
            }
        });
        ToggleButton toggle12 = (ToggleButton) view.findViewById(R.id.whiteBike);
        toggle12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                    ((GPSApplication)getActivity().getApplication()).setbikewhite(true);
                } else {


                    ((GPSApplication)getActivity().getApplication()).setbikewhite(false);
                }
            }
        });
        /////////////////////////////////////////////////////////////SURFACE///////////////////////////////////////////////////////////
        Switch onOffSwitch = (Switch)  view.findViewById(R.id.surface);  ////////////Szabi Edit
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ((GPSApplication)getActivity().getApplication()).setSurface("PAVED");
                }else{
                    ((GPSApplication)getActivity().getApplication()).setSurface("UNPAVED");
                }

            }

        });


        return view;
    }





}