package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifViewSavedState.java */
/* renamed from: pl.droidsonroids.gif.e */
/* loaded from: classes3.dex */
public class C14748e extends View.BaseSavedState {
    public static final Parcelable.Creator<C14748e> CREATOR = new C14749a();

    /* renamed from: c */
    final long[][] f33009c;

    /* compiled from: GifViewSavedState.java */
    /* renamed from: pl.droidsonroids.gif.e$a */
    /* loaded from: classes3.dex */
    static class C14749a implements Parcelable.Creator<C14748e> {
        C14749a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C14748e createFromParcel(Parcel parcel) {
            return new C14748e(parcel, (C14749a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C14748e[] newArray(int i) {
            return new C14748e[i];
        }
    }

    /* synthetic */ C14748e(Parcel parcel, C14749a c14749a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m403a(Drawable drawable, int i) {
        long[][] jArr = this.f33009c;
        if (jArr[i] == null || !(drawable instanceof C14741b)) {
            return;
        }
        C14741b c14741b = (C14741b) drawable;
        c14741b.m409j(c14741b.f32979y.m423t(jArr[i], c14741b.f32978x));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f33009c.length);
        for (long[] jArr : this.f33009c) {
            parcel.writeLongArray(jArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14748e(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f33009c = new long[drawableArr.length];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C14741b) {
                this.f33009c[i] = ((C14741b) drawable).f32979y.m433j();
            } else {
                this.f33009c[i] = null;
            }
        }
    }

    private C14748e(Parcel parcel) {
        super(parcel);
        this.f33009c = new long[parcel.readInt()];
        int i = 0;
        while (true) {
            long[][] jArr = this.f33009c;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }
}
