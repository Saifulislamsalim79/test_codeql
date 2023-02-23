package ai.kudi.agent.product.repository;

import ai.kudi.agent.bills.data.BillerFactory;
import ai.kudi.agent.bills.data.ProductFactory;
import ai.kudi.agent.network.BuildConfig;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import com.google.firebase.database.InterfaceC5627o;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
/* compiled from: RemoteBillerRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\b\u0018\u00010\fJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0004\u0012\u00020\b\u0018\u00010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;", "", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "getFirebaseDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "fetchBillers", "", "newSetup", "", "callback", "Lkotlin/Function1;", "", "Lai/kudi/agent/bills/data/Biller;", "fetchProducts", "Lai/kudi/agent/bills/data/Product;", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteBillerRepositoryImpl {
    public static final String BILLERS_DEBUG_REF = "v5-qa";
    public static final String BILLERS_PROD_REF = "v4";
    public static final Companion Companion;
    private final C5615f firebaseDatabase;

    /* compiled from: RemoteBillerRepositoryImpl.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl$Companion;", "", "()V", "BILLERS_DEBUG_REF", "", "BILLERS_PROD_REF", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public RemoteBillerRepositoryImpl(C5615f c5615f) {
        Log_OC.getArray(c5615f, "firebaseDatabase");
        this.firebaseDatabase = c5615f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchBillers(final boolean z, final InterfaceC11767l interfaceC11767l) {
        C5615f $r3 = this.firebaseDatabase;
        C5612d $r2 = $r3.m24316f(BuildConfig.BILLERS_FIREBASE_URL);
        Log_OC.loadImage($r2, "firebaseDatabase.getReference(BuildConfig.BILLERS_FIREBASE_URL)");
        $r2.m24307b(new InterfaceC5627o() { // from class: ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl$fetchBillers$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.firebase.database.InterfaceC5627o
            public void onCancelled(C5611c c5611c) {
                InterfaceC11767l $r5;
                Log_OC.getArray(c5611c, "p0");
                StringBuilder $r22 = new StringBuilder();
                $r22.append("It was cancelled for this reason ");
                String $r32 = c5611c.m24329h();
                $r22.append($r32);
                $r22.append(" with details ");
                String $r33 = c5611c.m24330g();
                $r22.append($r33);
                $r22.append(" and a new setup ==> ");
                boolean $z0 = z;
                $r22.append($z0);
                String $r34 = $r22.toString();
                Object[] $r4 = new Object[0];
                Timber.m1627e($r34, $r4);
                boolean $z02 = z;
                if (!$z02 || ($r5 = interfaceC11767l) == null) {
                    return;
                }
                BillerFactory $r6 = BillerFactory.INSTANCE;
                List $r7 = $r6.getBillers();
                $r5.invoke($r7);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:7:0x0021 */
            @Override // com.google.firebase.database.InterfaceC5627o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onDataChange(com.google.firebase.database.C5608b r15) {
                /*
                    r14 = this;
                    java.lang.String r0 = "p0"
                    kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
                    java.lang.Iterable r1 = r15.m24343c()     // Catch: java.lang.Exception -> L45
                    java.lang.String r0 = "p0.children"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)     // Catch: java.lang.Exception -> L45
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)     // Catch: java.lang.Exception -> L45
                    r2.<init>(r3)     // Catch: java.lang.Exception -> L45
                    java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> L45
                L1d:
                    boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L45
                    if (r6 == 0) goto L3c
                    java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L45
                    r8 = r7
                    com.google.firebase.database.b r8 = (com.google.firebase.database.C5608b) r8
                    r15 = r8
                    java.lang.Class<ai.kudi.agent.bills.data.Biller> r9 = ai.kudi.agent.bills.data.Biller.class
                    java.lang.Object r7 = r15.m24339g(r9)     // Catch: java.lang.Exception -> L45
                    kotlin.p483e0.p485d.Log_OC.append(r7)     // Catch: java.lang.Exception -> L45
                    r11 = r7
                    ai.kudi.agent.bills.data.Biller r11 = (ai.kudi.agent.bills.data.Biller) r11
                    r10 = r11
                    r2.add(r10)     // Catch: java.lang.Exception -> L45
                    goto L1d
                L3c:
                    kotlin.e0.c.l<java.util.List<ai.kudi.agent.bills.data.Biller>, kotlin.w> r12 = r2
                    if (r12 != 0) goto L41
                    return
                L41:
                    r12.invoke(r2)     // Catch: java.lang.Exception -> L45
                    return
                L45:
                    r13 = move-exception
                    r13.printStackTrace()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl$fetchBillers$1.onDataChange(com.google.firebase.database.b):void");
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchProducts(final boolean z, final InterfaceC11767l interfaceC11767l) {
        C5615f $r3 = this.firebaseDatabase;
        C5612d $r2 = $r3.m24316f(BuildConfig.PRODUCTS_FIREBASE_URL);
        Log_OC.loadImage($r2, "firebaseDatabase.getReference(BuildConfig.PRODUCTS_FIREBASE_URL)");
        $r2.m24307b(new InterfaceC5627o() { // from class: ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl$fetchProducts$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.firebase.database.InterfaceC5627o
            public void onCancelled(C5611c c5611c) {
                InterfaceC11767l $r5;
                Log_OC.getArray(c5611c, "p0");
                StringBuilder $r22 = new StringBuilder();
                $r22.append("It was cancelled for this reason ");
                String $r32 = c5611c.m24329h();
                $r22.append($r32);
                $r22.append(" with details ");
                String $r33 = c5611c.m24330g();
                $r22.append($r33);
                $r22.append(" and a new setup ==> ");
                boolean $z0 = z;
                $r22.append($z0);
                String $r34 = $r22.toString();
                Object[] $r4 = new Object[0];
                Timber.m1627e($r34, $r4);
                boolean $z02 = z;
                if (!$z02 || ($r5 = interfaceC11767l) == null) {
                    return;
                }
                ProductFactory $r6 = ProductFactory.INSTANCE;
                List $r7 = $r6.getProducts();
                $r5.invoke($r7);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:7:0x0021 */
            @Override // com.google.firebase.database.InterfaceC5627o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onDataChange(com.google.firebase.database.C5608b r15) {
                /*
                    r14 = this;
                    java.lang.String r0 = "p0"
                    kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
                    java.lang.Iterable r1 = r15.m24343c()     // Catch: java.lang.Exception -> L45
                    java.lang.String r0 = "p0.children"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)     // Catch: java.lang.Exception -> L45
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)     // Catch: java.lang.Exception -> L45
                    r2.<init>(r3)     // Catch: java.lang.Exception -> L45
                    java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> L45
                L1d:
                    boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L45
                    if (r6 == 0) goto L3c
                    java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L45
                    r8 = r7
                    com.google.firebase.database.b r8 = (com.google.firebase.database.C5608b) r8
                    r15 = r8
                    java.lang.Class<ai.kudi.agent.bills.data.Product> r9 = ai.kudi.agent.bills.data.Product.class
                    java.lang.Object r7 = r15.m24339g(r9)     // Catch: java.lang.Exception -> L45
                    kotlin.p483e0.p485d.Log_OC.append(r7)     // Catch: java.lang.Exception -> L45
                    r11 = r7
                    ai.kudi.agent.bills.data.Product r11 = (ai.kudi.agent.bills.data.Product) r11
                    r10 = r11
                    r2.add(r10)     // Catch: java.lang.Exception -> L45
                    goto L1d
                L3c:
                    kotlin.e0.c.l<java.util.List<ai.kudi.agent.bills.data.Product>, kotlin.w> r12 = r2
                    if (r12 != 0) goto L41
                    return
                L41:
                    r12.invoke(r2)     // Catch: java.lang.Exception -> L45
                    return
                L45:
                    r13 = move-exception
                    r13.printStackTrace()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl$fetchProducts$1.onDataChange(com.google.firebase.database.b):void");
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C5615f getFirebaseDatabase() {
        C5615f r1 = this.firebaseDatabase;
        return r1;
    }
}
