package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC1367c;
/* compiled from: AppCompatProgressBarHelper.java */
/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes2.dex */
class C1127n {

    /* renamed from: c */
    private static final int[] f3441c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f3442a;

    /* renamed from: b */
    private Bitmap f3443b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1127n(ProgressBar progressBar) {
        this.f3442a = progressBar;
    }

    /* renamed from: a */
    private Shape m37060a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: d */
    private Drawable m37058d(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC1367c) {
            InterfaceC1367c interfaceC1367c = (InterfaceC1367c) drawable;
            Drawable mo36182b = interfaceC1367c.mo36182b();
            if (mo36182b != null) {
                interfaceC1367c.mo36183a(m37058d(mo36182b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m37058d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3443b == null) {
                this.f3443b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m37060a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m37057e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m37058d = m37058d(animationDrawable.getFrame(i), true);
                m37058d.setLevel(10000);
                animationDrawable2.addFrame(m37058d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m37059b() {
        return this.f3443b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37024c(AttributeSet attributeSet, int i) {
        C1138r0 m37026v = C1138r0.m37026v(this.f3442a.getContext(), attributeSet, f3441c, i, 0);
        Drawable m37040h = m37026v.m37040h(0);
        if (m37040h != null) {
            this.f3442a.setIndeterminateDrawable(m37057e(m37040h));
        }
        Drawable m37040h2 = m37026v.m37040h(1);
        if (m37040h2 != null) {
            this.f3442a.setProgressDrawable(m37058d(m37040h2, false));
        }
        m37026v.m37025w();
    }
}
