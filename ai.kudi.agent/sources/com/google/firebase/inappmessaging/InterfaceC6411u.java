package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.model.C6365a;
/* compiled from: FirebaseInAppMessagingDisplayCallbacks.java */
/* renamed from: com.google.firebase.inappmessaging.u */
/* loaded from: classes2.dex */
public interface InterfaceC6411u {

    /* compiled from: FirebaseInAppMessagingDisplayCallbacks.java */
    /* renamed from: com.google.firebase.inappmessaging.u$a */
    /* loaded from: classes2.dex */
    public enum EnumC6412a {
        UNKNOWN_DISMISS_TYPE,
        AUTO,
        CLICK,
        SWIPE
    }

    /* compiled from: FirebaseInAppMessagingDisplayCallbacks.java */
    /* renamed from: com.google.firebase.inappmessaging.u$b */
    /* loaded from: classes2.dex */
    public enum EnumC6413b {
        UNSPECIFIED_RENDER_ERROR,
        IMAGE_FETCH_ERROR,
        IMAGE_DISPLAY_ERROR,
        IMAGE_UNSUPPORTED_FORMAT
    }

    /* renamed from: a */
    com.google.android.gms.tasks.j<Void> mo22090a(C6365a c6365a);

    /* renamed from: b */
    com.google.android.gms.tasks.j<Void> mo22089b(EnumC6413b enumC6413b);

    /* renamed from: c */
    com.google.android.gms.tasks.j<Void> mo22088c(EnumC6412a enumC6412a);

    /* renamed from: d */
    com.google.android.gms.tasks.j<Void> mo22087d();
}
