package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.SubMenuC1023r;
import com.google.android.material.internal.C4680j;
import p272h.p286c.p287a.p323c.p329n.C9293b;
/* compiled from: BottomNavigationPresenter.java */
/* renamed from: com.google.android.material.bottomnavigation.d */
/* loaded from: classes2.dex */
public class C4535d implements InterfaceC1014m {

    /* renamed from: c */
    private C0999g f11151c;

    /* renamed from: d */
    private C4533c f11152d;

    /* renamed from: e */
    private boolean f11153e = false;

    /* renamed from: f */
    private int f11154f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomNavigationPresenter.java */
    /* renamed from: com.google.android.material.bottomnavigation.d$a */
    /* loaded from: classes2.dex */
    public static class C4536a implements Parcelable {
        public static final Parcelable.Creator<C4536a> CREATOR = new C4537a();

        /* renamed from: c */
        int f11155c;

        /* renamed from: d */
        C4680j f11156d;

        /* compiled from: BottomNavigationPresenter.java */
        /* renamed from: com.google.android.material.bottomnavigation.d$a$a */
        /* loaded from: classes2.dex */
        static class C4537a implements Parcelable.Creator<C4536a> {
            C4537a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4536a createFromParcel(Parcel parcel) {
                return new C4536a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4536a[] newArray(int i) {
                return new C4536a[i];
            }
        }

        C4536a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11155c);
            parcel.writeParcelable(this.f11156d, 0);
        }

        C4536a(Parcel parcel) {
            this.f11155c = parcel.readInt();
            this.f11156d = (C4680j) parcel.readParcelable(C4536a.class.getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
    }

    /* renamed from: b */
    public void m27486b(C4533c c4533c) {
        this.f11152d = c4533c;
    }

    /* renamed from: c */
    public void m27485c(int i) {
        this.f11154f = i;
    }

    /* renamed from: d */
    public void m27484d(boolean z) {
        this.f11153e = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: h */
    public int mo26759h() {
        return this.f11154f;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        if (this.f11153e) {
            return;
        }
        if (z) {
            this.f11152d.m27498d();
        } else {
            this.f11152d.m27488n();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: j */
    public boolean mo26757j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: k */
    public boolean mo26756k(C0999g c0999g, C1003i c1003i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: l */
    public boolean mo26755l(C0999g c0999g, C1003i c1003i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: m */
    public void mo26754m(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: n */
    public void mo26753n(Context context, C0999g c0999g) {
        this.f11151c = c0999g;
        this.f11152d.mo26852b(c0999g);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: o */
    public void mo26752o(Parcelable parcelable) {
        if (parcelable instanceof C4536a) {
            C4536a c4536a = (C4536a) parcelable;
            this.f11152d.m27489m(c4536a.f11155c);
            this.f11152d.setBadgeDrawables(C9293b.m15150b(this.f11152d.getContext(), c4536a.f11156d));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: r */
    public Parcelable mo26749r() {
        C4536a c4536a = new C4536a();
        c4536a.f11155c = this.f11152d.getSelectedItemId();
        c4536a.f11156d = C9293b.m15149c(this.f11152d.getBadgeDrawables());
        return c4536a;
    }
}
