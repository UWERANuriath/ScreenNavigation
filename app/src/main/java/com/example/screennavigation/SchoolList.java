package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SchoolList extends AppCompatActivity {

    String [] schoolsArray = {"IPRC KGL", "MOUNT KENYA", "OUK","ULK","OUK Musanze","IPRC Tumba","IPRC Gishari"," UR kigali","IPRC Huye","Uk kigali","UR Rusizi","IPRC kitabi","E.S.st.francois.shangi","UR Huye"," UR KAMONYI","IPRC Zaza","UR tumba"};
    String [] highschoolArray;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_list);
        setTitle("Schools");
        highschoolArray= getResources().getStringArray(R.array.secondaryschoollist);
        ListView listview = (ListView)findViewById(R.id.list);
//      ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textitem,schoolsArray);
//        listview.setAdapter(adapter);
//
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textitem,highschoolArray);
        listview.setAdapter(adapter);
       listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String selected =((TextView)view.findViewById(R.id.textitem)).getText().toString();
               Toast.makeText(getApplicationContext(),selected,Toast.LENGTH_LONG).show();
//
//               if(selected.contains("IPRC")){
//                   Toast.makeText(getApplicationContext(),"This is Polytechnique School",Toast.LENGTH_LONG).show();
//               }
               switch(position){
                   case 0:
                       Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                       break;
                       case 1:
                           Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                           break;
                       case 2:
                           Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                           break;
                        case 3:
                            Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                            break;
                       case 4:
                           Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                           break;
                       case 5:
                           Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                           break;

                       case 6:
                           Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                           break;
                       case 7:
                           Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                           break;
                       case 8:
                       Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                       break;

                      case 9:
                          Toast.makeText(getApplicationContext(),selected +"is on position" +position,Toast.LENGTH_LONG).show();
                          break;
                   default:

               }
           }
       });
    }
}