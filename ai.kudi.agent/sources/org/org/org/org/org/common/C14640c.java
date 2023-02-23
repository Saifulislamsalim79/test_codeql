package org.org.org.org.org.common;

import com.smartlook.sdk.smartlook.integration.IntegrationListener;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* renamed from: org.org.org.org.org.common.c */
/* loaded from: classes.dex */
public final class C14640c extends AbstractC11802m implements InterfaceC11771p<IntegrationListener, String, C13666w> {

    /* renamed from: d */
    public static final C14640c f32527d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14640c $r0 = new C14640c();
        f32527d = $r0;
    }

    public C14640c() {
        super(2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(IntegrationListener integrationListener, String str) {
        IntegrationListener $r3 = integrationListener;
        String $r4 = str;
        show($r3, $r4);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    public final void show(IntegrationListener integrationListener, String str) {
        Log_OC.getArray(integrationListener, "integrationListener");
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        integrationListener.onSessionReady(str);
    }
}
