package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import pl.droidsonroids.gif.C14750f;
/* loaded from: classes3.dex */
public class GifImageView extends ImageView {

    /* renamed from: c */
    private boolean f32960c;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m443a(C14750f.m398c(this, attributeSet, 0, 0));
    }

    /* renamed from: a */
    private void m443a(C14750f.C14751a c14751a) {
        this.f32960c = c14751a.f33013a;
        int i = c14751a.f33011c;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = c14751a.f33012d;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C14748e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14748e c14748e = (C14748e) parcelable;
        super.onRestoreInstanceState(c14748e.getSuperState());
        c14748e.m403a(getDrawable(), 0);
        c14748e.m403a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new C14748e(super.onSaveInstanceState(), this.f32960c ? getDrawable() : null, this.f32960c ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (C14750f.m396e(this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    public void setFreezesAnimation(boolean z) {
        this.f32960c = z;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (C14750f.m396e(this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (C14750f.m397d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
