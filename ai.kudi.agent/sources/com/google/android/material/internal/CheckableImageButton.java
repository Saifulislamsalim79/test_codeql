package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import p201g.p202a.C7452a;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p243j.p244a.AbstractC7781a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: x */
    private static final int[] f11623x = {16842912};

    /* renamed from: e */
    private boolean f11624e;

    /* renamed from: f */
    private boolean f11625f;

    /* renamed from: w */
    private boolean f11626w;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes2.dex */
    class C4653a extends C7676a {
        C4653a() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: f */
        public void mo17397f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo17397f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17696Y(CheckableImageButton.this.m26863a());
            c7716c.m17695Z(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    /* loaded from: classes2.dex */
    public static class C4654b extends AbstractC7781a {
        public static final Parcelable.Creator<C4654b> CREATOR = new C4655a();

        /* renamed from: e */
        boolean f11628e;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        /* loaded from: classes2.dex */
        static class C4655a implements Parcelable.ClassLoaderCreator<C4654b> {
            C4655a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4654b createFromParcel(Parcel parcel) {
                return new C4654b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4654b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4654b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4654b[] newArray(int i) {
                return new C4654b[i];
            }
        }

        public C4654b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m26862b(Parcel parcel) {
            this.f11628e = parcel.readInt() == 1;
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11628e ? 1 : 0);
        }

        public C4654b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m26862b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.imageButtonStyle);
    }

    /* renamed from: a */
    public boolean m26863a() {
        return this.f11625f;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f11624e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f11624e) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f11623x.length), f11623x);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4654b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4654b c4654b = (C4654b) parcelable;
        super.onRestoreInstanceState(c4654b.m17424a());
        setChecked(c4654b.f11628e);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C4654b c4654b = new C4654b(super.onSaveInstanceState());
        c4654b.f11628e = this.f11624e;
        return c4654b;
    }

    public void setCheckable(boolean z) {
        if (this.f11625f != z) {
            this.f11625f = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f11625f || this.f11624e == z) {
            return;
        }
        this.f11624e = z;
        refreshDrawableState();
        sendAccessibilityEvent(IjkMediaMeta.FF_PROFILE_H264_INTRA);
    }

    public void setPressable(boolean z) {
        this.f11626w = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f11626w) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f11624e);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11625f = true;
        this.f11626w = true;
        C7759x.m17498p0(this, new C4653a());
    }
}
