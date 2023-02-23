package org.org.org.org.xml.asm.signature;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.app.job.JobService;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.tree.InterfaceC14336i;
import org.org.org.org.org.common.screens.C14646h;
import org.org.org.org.org.common.screens.InterfaceC14645a;
import org.org.org.org.xml.core.util.Label;
/* renamed from: org.org.org.org.xml.asm.signature.g  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AbstractjobJobServiceC14737g extends JobService implements InterfaceC14732a {

    /* renamed from: a */
    public final InterfaceC11824h f32945a;

    /* renamed from: b */
    public final InterfaceC11824h f32946b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractjobJobServiceC14737g() {
        InterfaceC11824h $r2;
        InterfaceC11824h $r22;
        C14733b $r1 = C14733b.f32942a;
        $r2 = C13218k.m5625b($r1);
        this.f32945a = $r2;
        StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 $r3 = StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2.INSTANCE;
        $r22 = C13218k.m5625b($r3);
        this.f32946b = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.signature.InterfaceC14732a
    /* renamed from: a */
    public InterfaceC14336i mo457a() {
        InterfaceC11824h $r2 = this.f32945a;
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
        C14646h $r1 = m454c();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public C14646h m454c() {
        InterfaceC11824h $r2 = this.f32946b;
        Object $r1 = $r2.getValue();
        C14646h $r3 = (C14646h) $r1;
        return $r3;
    }

    public void onSaveInstanceState(Label label, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(label, TransactionBreakDownItemType.DATA);
        Log_OC.getArray(interfaceC11767l, "result");
        C14736e.m459a(this, label, interfaceC11767l);
    }
}
