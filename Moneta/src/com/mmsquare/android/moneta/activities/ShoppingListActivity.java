package com.mmsquare.android.moneta.activities;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import com.mmsquare.android.moneta.DummyCursor;

public class ShoppingListActivity extends ListActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Cursor dummyCursor = new DummyCursor(12);

//        Cursor mCursor = this.getContentResolver().query(Contacts.People.CONTENT_URI, null, null, null, null);
//        startManagingCursor(mCursor);
         ListAdapter adapter = new SimpleCursorAdapter(
                 this, // Context.
                 android.R.layout.two_line_list_item,  // Specify the row template to use (here, two columns bound to the two retrieved cursor rows).
                 dummyCursor,                                              // Pass in the cursor to bind to.
                 new String[] {"line1","line2"},           // Array of cursor columns to bind to.
                 new int[] {android.R.id.text1, android.R.id.text2});  // Parallel array of which template objects to bind to those columns.

         // Bind to our new adapter.
         setListAdapter(adapter);
    }

    public void onListItemClick(ListView l, View v, int position, long id)  {

    }
}