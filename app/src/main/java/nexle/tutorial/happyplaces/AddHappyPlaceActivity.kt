package nexle.tutorial.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nexle.tutorial.happyplaces.databinding.ActivityAddhappyPlaceBinding

class AddHappyPlaceActivity : AppCompatActivity() {
    private var binding: ActivityAddhappyPlaceBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        // This call the parent constructor
        super.onCreate(savedInstanceState)
        //This is used to align the xml view to this class
        setContentView(R.layout.activity_addhappy_place)

/*        binding = ActivityAddhappyPlaceBinding.inflate(layoutInflater)
        setContentView(binding?.root)*/
        // TODO (Step 2: Setting up the action bar using the toolbar and making enable the home back button and also adding the click of it.)
        // START
       // setSupportActionBar(binding?.toolbarAddPlace)
        setSupportActionBar()
        if(supportActionBar!=null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
         // Use the toolbar to set the action bar.
        //
        binding?.toolbarAddPlace?.setOnClickListener {
            onBackPressed()
        }
    }
}