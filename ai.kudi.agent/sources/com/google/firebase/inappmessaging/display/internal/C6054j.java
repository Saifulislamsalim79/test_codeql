package com.google.firebase.inappmessaging.display.internal;

import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p082o.InterfaceC2351e;
import com.bumptech.glide.p082o.p083j.InterfaceC2360d;
import com.google.firebase.inappmessaging.InterfaceC6411u;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
/* compiled from: GlideErrorListener.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.j */
/* loaded from: classes2.dex */
public class C6054j implements InterfaceC2351e<Object> {

    /* renamed from: a */
    private AbstractC6386i f14765a;

    /* renamed from: b */
    private InterfaceC6411u f14766b;

    @Override // com.bumptech.glide.p082o.InterfaceC2351e
    /* renamed from: a */
    public boolean mo22897a(GlideException glideException, Object obj, InterfaceC2360d<Object> interfaceC2360d, boolean z) {
        C6065m.m22821a("Image Downloading  Error : " + glideException.getMessage() + ":" + glideException.getCause());
        if (this.f14765a == null || this.f14766b == null) {
            return false;
        }
        if (glideException.getLocalizedMessage().contains("Failed to decode")) {
            this.f14766b.mo22089b(InterfaceC6411u.EnumC6413b.IMAGE_UNSUPPORTED_FORMAT);
            return false;
        }
        this.f14766b.mo22089b(InterfaceC6411u.EnumC6413b.UNSPECIFIED_RENDER_ERROR);
        return false;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2351e
    /* renamed from: b */
    public boolean mo22896b(Object obj, Object obj2, InterfaceC2360d<Object> interfaceC2360d, EnumC1993a enumC1993a, boolean z) {
        C6065m.m22821a("Image Downloading  Success : " + obj);
        return false;
    }
}
