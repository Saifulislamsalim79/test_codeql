package org.org.org.org.org.common;

import com.smartlook.sdk.smartlook.integration.IntegrationListener;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class Function extends AbstractC11802m implements InterfaceC11771p<IntegrationListener, String, C13666w> {

    /* renamed from: N */
    public static final Function f32522N;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Function $r0 = new Function();
        f32522N = $r0;
    }

    public Function() {
        super(2);
    }

    public final void add(IntegrationListener integrationListener, String str) {
        Log_OC.getArray(integrationListener, "integrationListener");
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        integrationListener.onVisitorReady(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(IntegrationListener integrationListener, String str) {
        IntegrationListener $r3 = integrationListener;
        String $r4 = str;
        add($r3, $r4);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }
}
