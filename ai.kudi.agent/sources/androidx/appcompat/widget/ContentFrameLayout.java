package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: c */
    private TypedValue f3065c;

    /* renamed from: d */
    private TypedValue f3066d;

    /* renamed from: e */
    private TypedValue f3067e;

    /* renamed from: f */
    private TypedValue f3068f;

    /* renamed from: w */
    private TypedValue f3069w;

    /* renamed from: x */
    private TypedValue f3070x;

    /* renamed from: y */
    private final Rect f3071y;

    /* renamed from: z */
    private InterfaceC1036a f3072z;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1036a {
        /* renamed from: a */
        void mo37387a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m37389a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m37388b(int i, int i2, int i3, int i4) {
        this.f3071y.set(i, i2, i3, i4);
        if (C7759x.m17535U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3069w == null) {
            this.f3069w = new TypedValue();
        }
        return this.f3069w;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3070x == null) {
            this.f3070x = new TypedValue();
        }
        return this.f3070x;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3067e == null) {
            this.f3067e = new TypedValue();
        }
        return this.f3067e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3068f == null) {
            this.f3068f = new TypedValue();
        }
        return this.f3068f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3065c == null) {
            this.f3065c = new TypedValue();
        }
        return this.f3065c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3066d == null) {
            this.f3066d = new TypedValue();
        }
        return this.f3066d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1036a interfaceC1036a = this.f3072z;
        if (interfaceC1036a != null) {
            interfaceC1036a.mo37387a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1036a interfaceC1036a = this.f3072z;
        if (interfaceC1036a != null) {
            interfaceC1036a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC1036a interfaceC1036a) {
        this.f3072z = interfaceC1036a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3071y = new Rect();
    }
}
