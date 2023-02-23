package p201g.p202a.p208n;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
/* compiled from: AllCapsTransformationMethod.java */
/* renamed from: g.a.n.a */
/* loaded from: classes2.dex */
public class C7483a implements TransformationMethod {

    /* renamed from: c */
    private Locale f17758c;

    public C7483a(Context context) {
        this.f17758c = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f17758c);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
