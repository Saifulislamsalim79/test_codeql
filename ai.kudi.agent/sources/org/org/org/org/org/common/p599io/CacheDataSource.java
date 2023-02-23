package org.org.org.org.org.common.p599io;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* renamed from: org.org.org.org.org.common.io.CacheDataSource */
/* loaded from: classes.dex */
public final class CacheDataSource extends AbstractC11802m implements InterfaceC11756a<Map<String, String>> {

    /* renamed from: c */
    public final /* synthetic */ C14644b f32537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDataSource(C14644b c14644b) {
        super(0);
        this.f32537c = c14644b;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Map<String, String> invoke() {
        Map $r1 = read();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map read() {
        C14644b $r4 = this.f32537c;
        Object $r5 = $r4.m915b();
        Object $r6 = $r5;
        if ($r5 == null) {
            $r6 = r11;
            Object r11 = new LinkedHashMap();
        }
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.VISITOR;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
        int $i0 = $r7.ordinal();
        if ($i0 != 0) {
            return (Map) $r6;
        }
        StringBuilder $r9 = new StringBuilder();
        String $r10 = "sessionToVisitorMap " + $r6;
        $r9.append($r10);
        $r9.append(", [logAspect: ");
        $r9.append($r2);
        $r9.append(']');
        String $r102 = $r9.toString();
        $r1.size($r2, $r3, "VisitorHandler", $r102);
        return (Map) $r6;
    }
}
