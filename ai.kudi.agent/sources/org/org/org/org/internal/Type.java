package org.org.org.org.internal;

import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.Attribute;
import lombok.org.libs.org.objectweb.asm.ClassReader;
import lombok.org.libs.org.objectweb.asm.asm.asm.ByteVector;
import lombok.org.libs.org.objectweb.asm.asm.asm.C14327a;
import lombok.org.libs.org.objectweb.asm.asm.asm.Item;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class Type implements InterfaceC14622a {

    /* renamed from: a */
    public final Attribute f32405a;

    public Type(Attribute attribute) {
        Log_OC.getArray(attribute, "httpClient");
        this.f32405a = attribute;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.internal.InterfaceC14622a
    /* renamed from: a */
    public void mo1024a(String str, List list, List list2, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Log_OC.getArray(list, "parts");
        Log_OC.getArray(list2, "queries");
        Log_OC.getArray(interfaceC11767l, "result");
        ByteVector $r5 = Item.f31581d;
        String $r2 = str + "/v2/write";
        Item $r7 = ByteVector.m2118a($r5, $r2, list, list2, null, 8, null);
        Attribute $r8 = this.f32405a;
        C14626b $r10 = new C14626b(interfaceC11767l);
        C14629p $r11 = new C14629p(interfaceC11767l);
        ClassReader $r9 = new ClassReader($r10, $r11);
        $r8.read($r7, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.internal.InterfaceC14622a
    /* renamed from: a */
    public void mo1023a(String str, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "requestJson");
        Log_OC.getArray(interfaceC11767l, "result");
        C14327a $r4 = lombok.org.libs.org.objectweb.asm.asm.asm.Type.f31582c;
        lombok.org.libs.org.objectweb.asm.asm.asm.Type $r2 = C14327a.m2117a($r4, "rec/check-recording/mobile", str, 0, null, null, 28, null);
        Attribute $r5 = this.f32405a;
        NavigationMenuPresenter $r7 = new NavigationMenuPresenter(interfaceC11767l);
        C14628e $r8 = new C14628e(interfaceC11767l);
        ClassReader $r6 = new ClassReader($r7, $r8);
        $r5.read($r2, $r6);
    }
}
