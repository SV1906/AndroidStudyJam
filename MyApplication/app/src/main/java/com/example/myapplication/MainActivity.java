package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ml.quaterion.text2summary.Text2Summary;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
//import kotlin.jvm.internal.Ref.ObjectRef;
import java.lang.Object;

import java.io.BufferedReader;
import java.io.File;
import java.util.HashMap;

public final class MainActivity extends AppCompatActivity {
    @Nullable
    private TextView TVSummary;
    @Nullable
    private Button button;
    private HashMap _$_findViewCache;

    @Nullable
    public final TextView getTVSummary() {
        return this.TVSummary;
    }

    public final void setTVSummary(@Nullable TextView var1) {
        this.TVSummary = var1;
    }

    @Nullable
    public final Button getButton() {
        return this.button;
    }

    public final void setButton(@Nullable Button var1) {
        this.button = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        View TextView =findViewById(R.id.textView);
            this.TVSummary = (android.widget.TextView) TextView;
            Button Button = findViewById(R.id.button);
            String someLongText = "In word processing and desktop publishing, a hard return or paragraph break indicates a new paragraph, to be distinguished from the soft return at the end of a line internal to a paragraph. This distinction allows word wrap to automatically re-flow text as it is edited, without losing paragraph breaks. The software may apply vertical white space or indenting at paragraph breaks, depending on the selected style.";
            final Object summary = new Object();
            summary.() = Text2Summary.Companion.summarize(someLongText, 0.4F);
            Button var10000 = this.button;
            if (var10000 == null) {
                Intrinsics.throwNpe();
            }

            var10000.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
                public final void onClick(View it) {
                    TextView var10000 = MainActivity.this.getTVSummary();
                    if (var10000 == null) {
                        Intrinsics.throwNpe();
                    }

                    var10000.setText((CharSequence)((String)summary.));
                }
            }));
        }
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
