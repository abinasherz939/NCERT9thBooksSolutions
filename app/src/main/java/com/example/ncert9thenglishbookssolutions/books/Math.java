package com.example.ncert9thenglishbookssolutions.books;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ncert9thenglishbookssolutions.MyShiftAdapter;
import com.example.ncert9thenglishbookssolutions.R;
import com.example.ncert9thenglishbookssolutions.document;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class Math extends AppCompatActivity {


    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("math");

    private MyShiftAdapter myShiftAdapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        Query query = notebookRef;
        FirestoreRecyclerOptions<document> options = new FirestoreRecyclerOptions.Builder<document>()
                .setQuery(query, document.class)
                .build();
        myShiftAdapter = new MyShiftAdapter(options);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myShiftAdapter);


    }





    @Override
    protected void onStart() {
        super.onStart();
        myShiftAdapter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();

        if (myShiftAdapter != null) {
            myShiftAdapter.stopListening();
        }
    }
}

