package org.org.org.org.xml.asm;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import e.a.a.a.e.d.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.ClassVisitor;
import lombok.org.asm.LayoutManager;
import lombok.org.asm.Menu;
import lombok.org.asm.Number;
import lombok.org.asm.SignatureReader;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.tree.InterfaceC14336i;
import org.org.org.org.asm.cryptopro.InterfaceC14594a;
import org.org.org.org.asm.signature.InterfaceC14613a;
import org.org.org.org.org.common.screens.InterfaceC14645a;
import org.org.org.org.xml.FastMap;
import org.org.org.org.xml.asm.signature.C14736e;
import org.org.org.org.xml.asm.signature.InterfaceC14732a;
import org.org.org.org.xml.core.Attribute;
import org.org.org.org.xml.core.Segment;
/* loaded from: classes.dex */
public final class ByteVector extends Label implements InterfaceC14732a, Number {

    /* renamed from: a */
    public final /* synthetic */ Number f32926a;

    /* renamed from: b */
    public final InterfaceC14594a f32927b;

    /* renamed from: j */
    public final InterfaceC14645a f32928j;

    /* renamed from: l */
    public final InterfaceC14336i f32929l;

    /* renamed from: n */
    public final List<a> f32930n;

    /* renamed from: r */
    public final ReentrantLock f32931r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ByteVector(FastMap fastMap, InterfaceC14613a interfaceC14613a, InterfaceC14594a interfaceC14594a, InterfaceC14336i interfaceC14336i, InterfaceC14645a interfaceC14645a) {
        super(fastMap);
        Log_OC.getArray(fastMap, "sessionRecordIdStorage");
        Log_OC.getArray(interfaceC14613a, "dispatcherProvider");
        Log_OC.getArray(interfaceC14594a, "networkUtil");
        Log_OC.getArray(interfaceC14336i, "writerApiHandler");
        Log_OC.getArray(interfaceC14645a, "sessionStorage");
        Menu $r6 = LayoutManager.m2369a(null, 1, null);
        InterfaceC11719g $r7 = interfaceC14613a.mo1060a();
        lombok.org.asm.ByteVector $r8 = (lombok.org.asm.ByteVector) $r6;
        InterfaceC11719g $r9 = $r7;
        Number $r10 = ClassVisitor.m2379a($r8.plus($r9));
        this.f32926a = $r10;
        this.f32927b = interfaceC14594a;
        this.f32929l = interfaceC14336i;
        this.f32928j = interfaceC14645a;
        ArrayList r13 = new ArrayList();
        this.f32930n = r13;
        ReentrantLock r14 = new ReentrantLock();
        this.f32931r = r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m476a(Attribute attribute) {
        InterfaceC14594a $r3 = this.f32927b;
        boolean $z0 = $r3.send();
        if (!$z0) {
            org.org.org.org.xml.core.util.Label $r4 = attribute.m450a();
            boolean $z02 = $r4.m445d();
            if (!$z02) {
                read(attribute);
                return;
            }
        }
        C14730e $r2 = new C14730e(this, attribute, null);
        SignatureReader.m2355a(this, null, null, $r2, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add() {
        /*
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r9.f32931r
            r0.lock()
            java.util.List<e.a.a.a.e.d.a> r1 = r9.f32930n     // Catch: java.lang.Throwable -> L2a
            java.util.List r1 = kotlin.p557z.C13722p.m3972B0(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.List<e.a.a.a.e.d.a> r2 = r9.f32930n     // Catch: java.lang.Throwable -> L2a
            r2.clear()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L26
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L2a
            r7 = r5
            org.org.org.org.xml.core.Segment r7 = (org.org.org.org.xml.core.Segment) r7     // Catch: java.lang.Throwable -> L2a
            r6 = r7
            r9.mo468a(r6)     // Catch: java.lang.Throwable -> L2a
            goto L14
        L26:
            r0.unlock()
            return
        L2a:
            r8 = move-exception
            r0.unlock()
            goto L2f
        L2f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.xml.asm.ByteVector.add():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(Attribute attribute) {
        ReentrantLock $r1 = this.f32931r;
        $r1.lock();
        try {
            List $r2 = this.f32930n;
            $r2.add(attribute);
        } finally {
            $r1.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.signature.InterfaceC14732a
    /* renamed from: a */
    public InterfaceC14336i mo457a() {
        InterfaceC14336i r1 = this.f32929l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.Label
    /* renamed from: a */
    public void mo468a(Segment segment) {
        Log_OC.getArray(segment, "jobType");
        boolean $z0 = segment instanceof Attribute;
        if ($z0) {
            Attribute $r2 = (Attribute) segment;
            m476a($r2);
        }
    }

    /* renamed from: a */
    public void m475a(org.org.org.org.xml.core.util.Label label, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(label, TransactionBreakDownItemType.DATA);
        Log_OC.getArray(interfaceC11767l, "result");
        C14736e.m459a(this, label, interfaceC11767l);
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
    public InterfaceC14645a mo455b() {
        InterfaceC14645a r1 = this.f32928j;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Number
    /* renamed from: e */
    public InterfaceC11719g mo474e() {
        Number $r2 = this.f32926a;
        InterfaceC11719g $r1 = $r2.mo474e();
        return $r1;
    }
}
