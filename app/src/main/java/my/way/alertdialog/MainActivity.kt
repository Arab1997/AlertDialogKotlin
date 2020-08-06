package my.way.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAlertDialogBtn = findViewById<Button>(R.id.showAlertDialog)
mAlertDialogBtn.setOnClickListener {
    //list of items to be displayed in alert dialog
    val listItems = arrayOf("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6" )

    val mBuilder  = AlertDialog.Builder(this@MainActivity)
    mBuilder.setTitle("Choose an action ")
    mBuilder.setSingleChoiceItems(listItems, -1){dialogInterface, i->
        textView.text = listItems[i]
        dialogInterface.dismiss()
    }
    mBuilder.setNeutralButton("Cancel"){dialog, which ->
        dialog.dismiss()
    }
    val mDialog = mBuilder.create()
    mDialog.show()
}


       /* mAlertDialogBtn.setOnClickListener {
            val mAlertDialog = AlertDialog.Builder(this@MainActivity)
            mAlertDialog.setTitle("Title")
            mAlertDialog.setMessage("Alert Dialog Message...")
            mAlertDialog.setIcon(R.mipmap.ic_launcher)

                    //add positive btn to
            mAlertDialog.setPositiveButton("YES"){dialog , id->
                //perform your action here when user click YES
                Toast.makeText(this@MainActivity, "YES", Toast.LENGTH_SHORT).show()
            }
            //add negative btn to
            mAlertDialog.setNegativeButton("NO"){dialog, id->
                dialog.dismiss()
            }
            mAlertDialog.show()
        }*/
    }
}