package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C4958a0;
import com.google.android.play.core.internal.InterfaceC4961b0;
import java.io.File;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.assetpacks.u1 */
/* loaded from: classes2.dex */
public final class C4928u1 implements InterfaceC4961b0<C4924t1> {

    /* renamed from: a */
    private final InterfaceC4961b0<String> f12528a;

    /* renamed from: b */
    private final InterfaceC4961b0<C4930v> f12529b;

    /* renamed from: c */
    private final InterfaceC4961b0<C4939x0> f12530c;

    /* renamed from: d */
    private final InterfaceC4961b0<Context> f12531d;

    /* renamed from: e */
    private final InterfaceC4961b0<C4862f2> f12532e;

    /* renamed from: f */
    private final InterfaceC4961b0<Executor> f12533f;

    public C4928u1(InterfaceC4961b0<String> interfaceC4961b0, InterfaceC4961b0<C4930v> interfaceC4961b02, InterfaceC4961b0<C4939x0> interfaceC4961b03, InterfaceC4961b0<Context> interfaceC4961b04, InterfaceC4961b0<C4862f2> interfaceC4961b05, InterfaceC4961b0<Executor> interfaceC4961b06) {
        this.f12528a = interfaceC4961b0;
        this.f12529b = interfaceC4961b02;
        this.f12530c = interfaceC4961b03;
        this.f12531d = interfaceC4961b04;
        this.f12532e = interfaceC4961b05;
        this.f12533f = interfaceC4961b06;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4924t1 mo15000a() {
        String mo15000a = this.f12528a.mo15000a();
        C4930v mo15000a2 = this.f12529b.mo15000a();
        C4939x0 mo15000a3 = this.f12530c.mo15000a();
        Context mo15000a4 = ((C4863f3) this.f12531d).mo15000a();
        C4862f2 mo15000a5 = this.f12532e.mo15000a();
        return new C4924t1(mo15000a != null ? new File(mo15000a4.getExternalFilesDir(null), mo15000a) : mo15000a4.getExternalFilesDir(null), mo15000a2, mo15000a3, mo15000a4, mo15000a5, C4958a0.m25951b(this.f12533f));
    }
}
