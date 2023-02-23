package ai.kudi.agent.banks.domain;

import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import com.google.firebase.database.InterfaceC5627o;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: BanksRemoteSource.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JE\u0010\u0005\u001a\u00020\u00062\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/banks/domain/BanksRemoteSource;", "", "firebaseDb", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "fetchBanks", "", "callback", "Lkotlin/Function1;", "", "Lai/kudi/agent/core/domain/room_entities/Bank;", "onError", "Lcom/google/firebase/database/DatabaseError;", "Lkotlin/ParameterName;", "name", "throwable", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BanksRemoteSource {
    private final C5615f firebaseDb;

    public BanksRemoteSource(C5615f c5615f) {
        Log_OC.getArray(c5615f, "firebaseDb");
        this.firebaseDb = c5615f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchBanks(final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(interfaceC11767l2, "onError");
        C5615f $r4 = this.firebaseDb;
        C5612d $r3 = $r4.m24316f("banks");
        $r3.m24307b(new InterfaceC5627o() { // from class: ai.kudi.agent.banks.domain.BanksRemoteSource$fetchBanks$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.firebase.database.InterfaceC5627o
            public void onCancelled(C5611c c5611c) {
                Log_OC.getArray(c5611c, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                RuntimeException $r2 = c5611c.m24328i();
                RuntimeException r7 = $r2;
                r7.printStackTrace();
                C13666w $r32 = C13666w.f30112a;
                String $r42 = Log_OC.m10359a("Bank fetching cancelled ", $r32);
                Object[] $r5 = new Object[0];
                Timber.wtf($r42, $r5);
                InterfaceC11767l $r6 = InterfaceC11767l.this;
                $r6.invoke(c5611c);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x002b */
            @Override // com.google.firebase.database.InterfaceC5627o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onDataChange(com.google.firebase.database.C5608b r22) {
                /*
                    r21 = this;
                    java.lang.String r2 = "snapshot"
                    r0 = r22
                    kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
                    r0 = r21
                    kotlin.e0.c.l<java.util.List<ai.kudi.agent.core.domain.room_entities.Bank>, kotlin.w> r3 = r2
                    kotlin.p$a r4 = kotlin.C13288p.f29444c     // Catch: java.lang.Throwable -> L56
                    r0 = r22
                    java.lang.Iterable r5 = r0.m24343c()     // Catch: java.lang.Throwable -> L56
                    java.lang.String r2 = "snapshot.children"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r5, r2)     // Catch: java.lang.Throwable -> L56
                    java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56
                    r8 = 10
                    int r7 = kotlin.p557z.C13722p.m3921o(r5, r8)     // Catch: java.lang.Throwable -> L56
                    r6.<init>(r7)     // Catch: java.lang.Throwable -> L56
                    java.util.Iterator r9 = r5.iterator()     // Catch: java.lang.Throwable -> L56
                L27:
                    boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L56
                    if (r10 == 0) goto L49
                    java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L56
                    r12 = r11
                    com.google.firebase.database.b r12 = (com.google.firebase.database.C5608b) r12     // Catch: java.lang.Throwable -> L56
                    r22 = r12
                    java.lang.Class<ai.kudi.agent.core.domain.room_entities.Bank> r13 = ai.kudi.agent.core.domain.room_entities.Bank.class
                    r0 = r22
                    java.lang.Object r11 = r0.m24339g(r13)     // Catch: java.lang.Throwable -> L56
                    kotlin.p483e0.p485d.Log_OC.append(r11)     // Catch: java.lang.Throwable -> L56
                    r15 = r11
                    ai.kudi.agent.core.domain.room_entities.Bank r15 = (ai.kudi.agent.core.domain.room_entities.Bank) r15     // Catch: java.lang.Throwable -> L56
                    r14 = r15
                    r6.add(r14)     // Catch: java.lang.Throwable -> L56
                    goto L27
                L49:
                    if (r3 != 0) goto L4d
                    r11 = 0
                    goto L52
                L4d:
                    r3.invoke(r6)     // Catch: java.lang.Throwable -> L56
                    kotlin.w r11 = kotlin.C13666w.f30112a     // Catch: java.lang.Throwable -> L56
                L52:
                    kotlin.C13288p.m5362a(r11)     // Catch: java.lang.Throwable -> L56
                    goto L66
                L56:
                    r16 = move-exception
                    kotlin.p$a r4 = kotlin.C13288p.f29444c
                    r0 = r16
                    java.lang.Object r17 = kotlin.C13291q.m5358a(r0)
                    r11 = r17
                    r0 = r17
                    kotlin.C13288p.m5362a(r0)
                L66:
                    java.lang.Throwable r16 = kotlin.C13288p.m5361b(r11)
                    if (r16 == 0) goto L87
                    r0 = r16
                    r0.printStackTrace()
                    kotlin.w r18 = kotlin.C13666w.f30112a
                    java.lang.String r2 = "error fetching banks "
                    r0 = r18
                    java.lang.String r19 = kotlin.p483e0.p485d.Log_OC.m10359a(r2, r0)
                    r8 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r20 = r0
                    r0 = r19
                    r1 = r20
                    p590o.p591a.Timber.wtf(r0, r1)
                L87:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.banks.domain.BanksRemoteSource$fetchBanks$1.onDataChange(com.google.firebase.database.b):void");
            }
        });
    }
}
