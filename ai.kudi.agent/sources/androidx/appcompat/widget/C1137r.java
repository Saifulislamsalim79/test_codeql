package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p201g.p202a.C7452a;
/* compiled from: AppCompatSeekBar.java */
/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes2.dex */
public class C1137r extends SeekBar {

    /* renamed from: c */
    private final C1139s f3458c;

    public C1137r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3458c.m37021h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3458c.m37020i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3458c.m37022g(canvas);
    }

    public C1137r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1139s c1139s = new C1139s(this);
        this.f3458c = c1139s;
        c1139s.mo37024c(attributeSet, i);
    }
}
