package org.org.org.org.xml.asm.signature;

import androidx.work.CoroutineWorker;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.tree.InterfaceC14336i;
import org.org.org.org.org.common.screens.C14646h;
import org.org.org.org.org.common.screens.InterfaceC14645a;
/* renamed from: org.org.org.org.xml.asm.signature.d */
/* loaded from: classes.dex */
public abstract class AbstractC14735d extends CoroutineWorker implements InterfaceC14732a {

    /* renamed from: a */
    public final InterfaceC11824h f32943a;

    /* renamed from: b */
    public final InterfaceC11824h f32944b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.signature.InterfaceC14732a
    /* renamed from: a */
    public InterfaceC14336i mo457a() {
        InterfaceC11824h $r2 = this.f32943a;
        Object $r1 = $r2.getValue();
        InterfaceC14336i $r3 = (InterfaceC14336i) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.signature.InterfaceC14732a
    /* renamed from: a */
    public boolean mo456a(Handle handle) {
        Log_OC.getArray(handle, "$this$cannotBeRecovered");
        boolean $z0 = C14736e.m461a(this, handle);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.signature.InterfaceC14732a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC14645a mo455b() {
        C14646h $r1 = m462c();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public C14646h m462c() {
        InterfaceC11824h $r2 = this.f32944b;
        Object $r1 = $r2.getValue();
        C14646h $r3 = (C14646h) $r1;
        return $r3;
    }
}
