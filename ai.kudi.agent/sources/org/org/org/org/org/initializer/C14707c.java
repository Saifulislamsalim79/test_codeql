package org.org.org.org.org.initializer;

import a.a.b.a.b.d.a;
import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13726r;
import lombok.org.libs.org.objectweb.asm.Attribute;
import lombok.org.libs.org.objectweb.asm.asm.Response;
import org.org.org.org.internal.C14627c;
/* renamed from: org.org.org.org.org.initializer.c */
/* loaded from: classes.dex */
public final class C14707c extends AbstractC11802m implements InterfaceC11756a<a> {

    /* renamed from: a */
    public static final C14707c f32800a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14707c $r0 = new C14707c();
        f32800a = $r0;
    }

    public C14707c() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Attribute m656a() {
        List $r3;
        Response $r2 = new Response("X-Requested-With", "com.android.browser");
        Response $r22 = new Response("Accept", "*/*");
        Response $r23 = new Response("Accept-Language", "en-US,en;q=0.8,cs;q=0.6");
        Response $r24 = new Response("Connection", "keep-alive");
        Response $r25 = new Response("Pragma", "no-cache");
        Response[] $r1 = {$r2, $r22, $r23, $r24, $r25};
        $r3 = C13726r.m3885k($r1);
        Frame $r5 = Frame.f32774d;
        C14627c $r6 = $r5.m677c();
        String $r7 = $r6.format();
        Attribute $r4 = new Attribute($r7, $r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ a invoke() {
        Attribute $r1 = m656a();
        return $r1;
    }
}
