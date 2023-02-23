package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.WithdrawalApi;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalTransactonStatusApiCommData;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.j;
import com.google.firebase.database.C5608b;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: UssdWithdrawalRepository.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\bJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository;", "", "localSource", "Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$LocalSource;", "remoteSource", "Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$RemoteSource;", "(Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$LocalSource;Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$RemoteSource;)V", "checkStatus", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Response;", "sessionId", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Request;", "fetchProviderList", "", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "generateCode", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Request;", "Companion", "LocalSource", "RemoteSource", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UssdWithdrawalRepository {
    public static final Companion Companion;
    private static final String USSD_PROVIDER_FIREBASE_DOCUMENT_NODE;
    private final LocalSource localSource;
    private final RemoteSource remoteSource;

    /* compiled from: UssdWithdrawalRepository.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$Companion;", "", "()V", "USSD_PROVIDER_FIREBASE_DOCUMENT_NODE", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: UssdWithdrawalRepository.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$LocalSource;", "", "db", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "getAllProviders", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "persistProviderList", "", "providerList", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LocalSource {
        private final CoreAppDatabase mAppWidgetManager;

        public LocalSource(CoreAppDatabase coreAppDatabase) {
            Log_OC.getArray(coreAppDatabase, "db");
            this.mAppWidgetManager = coreAppDatabase;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11688p getAllProviders() {
            CoreAppDatabase $r1 = this.mAppWidgetManager;
            UssdWithdrawalProviderDao $r2 = $r1.getUssdWithdrawalProviderDao();
            AbstractC11688p $r3 = $r2.fetchAllProviders();
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void persistProviderList(List list) {
            Log_OC.getArray(list, "providerList");
            CoreAppDatabase $r2 = this.mAppWidgetManager;
            UssdWithdrawalProviderDao $r3 = $r2.getUssdWithdrawalProviderDao();
            AbstractC11271b $r4 = $r3.deleteAllProviders();
            Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
            AbstractC11271b $r42 = $r4.s($r5);
            Item $r52 = ContextUtils.LogError();
            $r42.m($r52).m11234q();
            CoreAppDatabase $r22 = this.mAppWidgetManager;
            UssdWithdrawalProviderDao $r32 = $r22.getUssdWithdrawalProviderDao();
            AbstractC11271b $r43 = $r32.insertProviders(list);
            Item $r53 = p425j.p444e.p470j0.ClassWriter.LogError();
            AbstractC11271b $r44 = $r43.s($r53);
            Item $r54 = ContextUtils.LogError();
            $r44.m($r54).m11234q();
        }
    }

    /* compiled from: UssdWithdrawalRepository.kt */
    @Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00130\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository$RemoteSource;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lai/kudi/agent/core/network/NetworkService;Lcom/google/firebase/database/FirebaseDatabase;)V", "checkStatus", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Response;", "sessionId", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Request;", "generateWithdrawalCode", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Request;", "refreshProviderList", "", "callback", "Lkotlin/Function1;", "", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class RemoteSource {
        private final C5615f firebaseDatabase;
        private final NetworkService networkService;

        public RemoteSource(NetworkService networkService, C5615f c5615f) {
            Log_OC.getArray(networkService, "networkService");
            Log_OC.getArray(c5615f, "firebaseDatabase");
            this.networkService = networkService;
            this.firebaseDatabase = c5615f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Incorrect condition in loop: B:4:0x002a */
        /* renamed from: refreshProviderList$lambda-1  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void m41791refreshProviderList$lambda1(kotlin.p483e0.p484c.InterfaceC11767l r16, com.google.firebase.database.C5608b r17) {
            /*
                java.lang.String r1 = "$callback"
                r0 = r16
                kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0 = r17
                java.lang.Iterable r3 = r0.m24343c()
                java.lang.String r1 = "it.children"
                kotlin.p483e0.p485d.Log_OC.loadImage(r3, r1)
                java.util.ArrayList r4 = new java.util.ArrayList
                r6 = 10
                int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)
                r4.<init>(r5)
                java.util.Iterator r7 = r3.iterator()
            L26:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L57
                java.lang.Object r9 = r7.next()
                r10 = r9
                com.google.firebase.database.b r10 = (com.google.firebase.database.C5608b) r10
                r17 = r10
                java.lang.Class<ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider> r11 = ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider.class
                r0 = r17
                java.lang.Object r9 = r0.m24339g(r11)
                if (r9 == 0) goto L4f
                r13 = r9
                ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider r13 = (ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider) r13
                r12 = r13
                boolean r8 = r2.add(r12)
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
                r4.add(r14)
                goto L26
            L4f:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider"
                r15.<init>(r1)
                throw r15
            L57:
                r0 = r16
                r0.invoke(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository.RemoteSource.m41791refreshProviderList$lambda1(kotlin.e0.c.l, com.google.firebase.database.b):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: refreshProviderList$lambda-2  reason: not valid java name */
        public static final void m41792refreshProviderList$lambda2(Exception exc) {
            Log_OC.getArray(exc, "it");
            exc.printStackTrace();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11688p checkStatus(String str, UssdWithdrawalTransactonStatusApiCommData.Request request) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
            NetworkService $r3 = this.networkService;
            WithdrawalApi $r4 = $r3.getWithdrawalApi();
            AbstractC11688p $r5 = $r4.checkStatus(str, request);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11688p generateWithdrawalCode(String str, UssdWithdrawalWithdrawalCodeGenerationApiCommData.Request request) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
            NetworkService $r3 = this.networkService;
            WithdrawalApi $r4 = $r3.getWithdrawalApi();
            AbstractC11688p $r5 = $r4.generateWithdrawalCode(str, request);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void refreshProviderList(final InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "callback");
            C5615f $r2 = this.firebaseDatabase;
            String $r3 = UssdWithdrawalRepository.USSD_PROVIDER_FIREBASE_DOCUMENT_NODE;
            C5612d $r4 = $r2.m24316f($r3);
            Log_OC.loadImage($r4, "firebaseDatabase.getReference(USSD_PROVIDER_FIREBASE_DOCUMENT_NODE)");
            j<C5608b> d = $r4.m24305d();
            d.m27797a(new InterfaceC4458g() { // from class: ai.kudi.agent.withdraw_cash.domain.repositories.k
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* renamed from: a */
                public final void m38081a(Object obj) {
                    InterfaceC11767l $r1 = InterfaceC11767l.this;
                    C5608b $r32 = (C5608b) obj;
                    UssdWithdrawalRepository.RemoteSource.m41791refreshProviderList$lambda1($r1, $r32);
                }
            });
            ClassWriter $r7 = ClassWriter.f2070b;
            d.m27798a($r7);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        USSD_PROVIDER_FIREBASE_DOCUMENT_NODE = "ussd-withdrawal-providers";
    }

    public UssdWithdrawalRepository(LocalSource localSource, RemoteSource remoteSource) {
        Log_OC.getArray(localSource, "localSource");
        Log_OC.getArray(remoteSource, "remoteSource");
        this.localSource = localSource;
        this.remoteSource = remoteSource;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p checkStatus(String str, UssdWithdrawalTransactonStatusApiCommData.Request request) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        RemoteSource $r4 = this.remoteSource;
        AbstractC11688p $r2 = $r4.checkStatus(str, request);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchProviderList() {
        RemoteSource $r3 = this.remoteSource;
        UssdWithdrawalRepository$fetchProviderList$1 $r1 = new UssdWithdrawalRepository$fetchProviderList$1(this);
        $r3.refreshProviderList($r1);
        LocalSource $r4 = this.localSource;
        AbstractC11688p $r2 = $r4.getAllProviders();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p generateCode(String str, UssdWithdrawalWithdrawalCodeGenerationApiCommData.Request request) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        RemoteSource $r4 = this.remoteSource;
        AbstractC11688p $r2 = $r4.generateWithdrawalCode(str, request);
        return $r2;
    }
}
