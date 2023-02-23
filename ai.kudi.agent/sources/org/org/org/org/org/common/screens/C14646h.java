package org.org.org.org.org.common.screens;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.p599io.Element;
import org.org.org.org.org.data.Attribute;
import org.org.org.org.org.menu.InterfaceC14715i;
import org.org.org.org.xml.FastMap;
/* renamed from: org.org.org.org.org.common.screens.h */
/* loaded from: classes.dex */
public final class C14646h implements InterfaceC14645a {

    /* renamed from: a */
    public final Element f32541a;

    /* renamed from: l */
    public final InterfaceC14715i f32542l;

    /* renamed from: m */
    public final FastMap f32543m;

    /* renamed from: w */
    public final Attribute f32544w;

    public C14646h(InterfaceC14715i interfaceC14715i, Element element, Attribute attribute, FastMap fastMap) {
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(element, "visitorHandler");
        Log_OC.getArray(attribute, "sessionConfigurationStorage");
        Log_OC.getArray(fastMap, "sessionRecordIdStorage");
        this.f32542l = interfaceC14715i;
        this.f32541a = element;
        this.f32544w = attribute;
        this.f32543m = fastMap;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.screens.InterfaceC14645a
    /* renamed from: a */
    public void mo913a(String str, int i) {
        Log_OC.getArray(str, "sessionId");
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.RECORD_STORAGE;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        int $i1 = $r5.ordinal();
        if ($i1 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "deleteRecord() called with: sessionId = " + str + ", recordIndex = " + i;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r1);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r1, $r2, "SessionStorage", $r82);
        }
        InterfaceC14715i $r9 = this.f32542l;
        $r9.mo547d(str, i);
        FastMap $r10 = this.f32543m;
        String $r3 = $r10.toString(str, i);
        $r10.get($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.screens.InterfaceC14645a
    public void add(String str) {
        Log_OC.getArray(str, "sessionId");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.RECORD_STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "deleteSession() called with: sessionId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "SessionStorage", $r82);
        }
        InterfaceC14715i $r9 = this.f32542l;
        $r9.mo548d(str);
        Element $r10 = this.f32541a;
        $r10.write(str);
        Attribute $r11 = this.f32544w;
        $r11.write(str);
        FastMap $r12 = this.f32543m;
        $r12.remove(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.common.screens.InterfaceC14645a
    /* renamed from: d */
    public void mo912d(String str) {
        Log_OC.getArray(str, "sessionId");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.RECORD_STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "deleteSessionIfPossible() called with: sessionId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "SessionStorage", $r82);
        }
        InterfaceC14715i $r9 = this.f32542l;
        boolean $z0 = $r9.mo554a(str);
        if ($z0) {
            return;
        }
        TopLevel$NativeErrors $r52 = $r4.get($r2, false, $r3);
        int $i02 = $r52.ordinal();
        if ($i02 == 0) {
            StringBuilder $r62 = new StringBuilder();
            String $r83 = "deleteSessionIfPossible() deleting sessionId = " + str;
            $r62.append($r83);
            $r62.append(", [logAspect: ");
            $r62.append($r2);
            $r62.append(']');
            String $r84 = $r62.toString();
            $r4.size($r2, $r3, "SessionStorage", $r84);
        }
        add(str);
    }
}
