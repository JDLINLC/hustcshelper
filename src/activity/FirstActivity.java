package activity;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.hustcshelper.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class FirstActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_layout);
		GridView gridview = (GridView)findViewById(R.id.gridview);
		
		ArrayList<HashMap<String,Object>>IstImageItem = new ArrayList<HashMap<String,Object>>();
		for(int i=0;i<20;i++)
		{
			HashMap<String,Object>map = new HashMap<String,Object>();
			map.put("ItemImage", R.drawable.test);
			map.put("ItemText","NO."+String.valueOf(i));
			IstImageItem.add(map);
		}
		
		SimpleAdapter salmageItems = new SimpleAdapter(this,
				IstImageItem,
				R.layout.night_item,
				new String[]{"ItemImage","ItemText"},
				new int[]{R.id.ItemImage,R.id.ItemText}
				);
		
		gridview.setAdapter(salmageItems);
		gridview.setOnItemClickListener(new ItemClickListener());
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.action_search:
			
		case R.id.action_settings:
			
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
