package p201g.p202a.p205l.p206a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p201g.p202a.p205l.p206a.C7472b;
/* compiled from: StateListDrawable.java */
/* renamed from: g.a.l.a.e */
/* loaded from: classes2.dex */
class C7479e extends C7472b {

    /* renamed from: E */
    private C7480a f17755E;

    /* renamed from: F */
    private boolean f17756F;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListDrawable.java */
    /* renamed from: g.a.l.a.e$a */
    /* loaded from: classes2.dex */
    public static class C7480a extends C7472b.AbstractC7476d {

        /* renamed from: J */
        int[][] f17757J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7480a(C7480a c7480a, C7479e c7479e, Resources resources) {
            super(c7480a, c7479e, resources);
            if (c7480a != null) {
                this.f17757J = c7480a.f17757J;
            } else {
                this.f17757J = new int[m18646f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m18614A(int[] iArr) {
            int[][] iArr2 = this.f17757J;
            int m18644h = m18644h();
            for (int i = 0; i < m18644h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C7479e(this, null);
        }

        @Override // p201g.p202a.p205l.p206a.C7472b.AbstractC7476d
        /* renamed from: o */
        public void mo18613o(int i, int i2) {
            super.mo18613o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f17757J, 0, iArr, 0, i);
            this.f17757J = iArr;
        }

        @Override // p201g.p202a.p205l.p206a.C7472b.AbstractC7476d
        /* renamed from: r */
        void mo18612r() {
            int[][] iArr = this.f17757J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f17757J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f17757J = iArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m18611z(int[] iArr, Drawable drawable) {
            int m18651a = m18651a(drawable);
            this.f17757J[m18651a] = iArr;
            return m18651a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C7479e(this, resources);
        }
    }

    C7479e(C7480a c7480a, Resources resources) {
        mo18617h(new C7480a(c7480a, this, resources));
        onStateChange(getState());
    }

    @Override // p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p202a.p205l.p206a.C7472b
    /* renamed from: h */
    public void mo18617h(C7472b.AbstractC7476d abstractC7476d) {
        super.mo18617h(abstractC7476d);
        if (abstractC7476d instanceof C7480a) {
            this.f17755E = (C7480a) abstractC7476d;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p202a.p205l.p206a.C7472b
    /* renamed from: j */
    public C7480a mo18618b() {
        return new C7480a(this.f17755E, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m18615k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17756F) {
            super.mutate();
            if (this == this) {
                this.f17755E.mo18612r();
                this.f17756F = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m18614A = this.f17755E.m18614A(iArr);
        if (m18614A < 0) {
            m18614A = this.f17755E.m18614A(StateSet.WILD_CARD);
        }
        return m18658g(m18614A) || onStateChange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7479e(C7480a c7480a) {
        if (c7480a != null) {
            mo18617h(c7480a);
        }
    }
}
