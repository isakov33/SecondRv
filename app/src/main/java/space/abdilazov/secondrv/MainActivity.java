package space.abdilazov.secondrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Modelka>list = new ArrayList<Modelka>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(this,list);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        list.add(new Modelka("Aaaaaaa",R.drawable.man));
        list.add(new Modelka("Bbbbbbb",R.drawable.man));
        list.add(new Modelka("Vvvvvvv",R.drawable.man));
        list.add(new Modelka("Mmmmmmm",R.drawable.man));
        list.add(new Modelka("Kkkkkkk",R.drawable.man));
        list.add(new Modelka("Lllllll",R.drawable.man));
        list.add(new Modelka("Ooooooo",R.drawable.man));
        list.add(new Modelka("Uuuuuuuu",R.drawable.man));
        list.add(new Modelka("Tttttttt",R.drawable.man));
        list.add(new Modelka("Qqqqqqqqq",R.drawable.man));
        list.add(new Modelka("Eeeeeeeee",R.drawable.man));
    }
}