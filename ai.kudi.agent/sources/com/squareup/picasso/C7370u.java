package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.C7360t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PicassoDrawable.java */
/* renamed from: com.squareup.picasso.u */
/* loaded from: classes2.dex */
public final class C7370u extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f17469h = new Paint();

    /* renamed from: a */
    private final boolean f17470a;

    /* renamed from: b */
    private final float f17471b;

    /* renamed from: c */
    private final C7360t.EnumC7366e f17472c;

    /* renamed from: d */
    Drawable f17473d;

    /* renamed from: e */
    long f17474e;

    /* renamed from: f */
    boolean f17475f;

    /* renamed from: g */
    int f17476g;

    C7370u(Context context, Bitmap bitmap, Drawable drawable, C7360t.EnumC7366e enumC7366e, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f17476g = 255;
        this.f17470a = z2;
        this.f17471b = context.getResources().getDisplayMetrics().density;
        this.f17472c = enumC7366e;
        if ((enumC7366e == C7360t.EnumC7366e.MEMORY || z) ? false : true) {
            this.f17473d = drawable;
            this.f17475f = true;
            this.f17474e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    private void m18870a(Canvas canvas) {
        f17469h.setColor(-1);
        canvas.drawPath(m18869b(0, 0, (int) (this.f17471b * 16.0f)), f17469h);
        f17469h.setColor(this.f17472c.f17463c);
        canvas.drawPath(m18869b(0, 0, (int) (this.f17471b * 15.0f)), f17469h);
    }

    /* renamed from: b */
    private static Path m18869b(int i, int i2, int i3) {
        Path path = new Path();
        float f = i;
        float f2 = i2;
        path.moveTo(f, f2);
        path.lineTo(i + i3, f2);
        path.lineTo(f, i2 + i3);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m18868c(ImageView imageView, Context context, Bitmap bitmap, C7360t.EnumC7366e enumC7366e, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C7370u(context, bitmap, drawable, enumC7366e, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m18867d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f17475f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f17474e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f17475f = false;
                this.f17473d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f17473d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f17476g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f17476g);
            }
        }
        if (this.f17470a) {
            m18870a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17473d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f17476g = i;
        Drawable drawable = this.f17473d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17473d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
