package org.org.org.org.org.initializer;

import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import lombok.org.libs.org.objectweb.asm.Attribute;
import org.org.org.org.app.C14581f;
import org.org.org.org.org.common.Buffer;
import org.org.org.org.org.common.data.ByteBufferList;
import org.org.org.org.org.common.p599io.C14644b;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.digests.C14704f;
import org.org.org.org.org.menu.C14714h;
/* loaded from: classes.dex */
public final class LogManager extends AbstractC11802m implements InterfaceC11756a<e.a.a.a.c.m.c> {
    public static final LogManager FROM_BEGINING;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        LogManager $r0 = new LogManager();
        FROM_BEGINING = $r0;
    }

    public LogManager() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final Buffer m673e() {
        C14708f $r2 = C14708f.f32807a;
        ByteBufferList $r3 = $r2.write();
        org.org.org.org.android.model.Log $r4 = $r2.getInstance();
        Frame $r5 = Frame.f32774d;
        Attribute $r6 = $r5.get();
        C14581f $r7 = $r2.getContext();
        C14704f $r8 = $r2.onSaveInstanceState();
        Label $r9 = $r2.size();
        C14714h $r10 = $r2.m655a();
        C14644b $r11 = $r2.m643l();
        Buffer $r1 = new Buffer($r3, $r4, $r6, $r7, $r8, $r9, $r10, $r11);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ e.a.a.a.c.m.c invoke() {
        Buffer $r1 = m673e();
        return $r1;
    }
}
