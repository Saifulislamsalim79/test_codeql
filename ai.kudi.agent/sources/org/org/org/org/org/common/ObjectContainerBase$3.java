package org.org.org.org.org.common;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.app.C14581f;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class ObjectContainerBase$3 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    public final /* synthetic */ Buffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectContainerBase$3(Buffer buffer) {
        super(1);
        this.this$0 = buffer;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void apply(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Buffer $r3 = this.this$0;
        C14581f $r2 = $r3.size;
        $r2.m1175b(str, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        apply($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
