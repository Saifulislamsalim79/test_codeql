package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p201g.p202a.C7452a;
/* compiled from: AppCompatRatingBar.java */
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes2.dex */
public class C1131p extends RatingBar {

    /* renamed from: c */
    private final C1127n f3451c;

    public C1131p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m37059b = this.f3451c.m37059b();
        if (m37059b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m37059b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C1131p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1127n c1127n = new C1127n(this);
        this.f3451c = c1127n;
        c1127n.mo37024c(attributeSet, i);
    }
}
