package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TerminalApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.domain.dto.VerifyTerminalConnectionRequest;
import ai.kudi.agent.transactions.domain.dto.VerifyTerminalConnectionResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: VerifyTerminalConnection.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/VerifyTerminalConnection;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/transactions/domain/dto/VerifyTerminalConnectionResponse;", "Lai/kudi/agent/transactions/domain/usecases/VerifyTerminalConnection$VerifyTerminalConnectionInput;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "VerifyTerminalConnectionInput", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyTerminalConnection implements OneInputUseCase<VerifyTerminalConnectionResponse, VerifyTerminalConnectionInput> {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    /* compiled from: VerifyTerminalConnection.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/VerifyTerminalConnection$VerifyTerminalConnectionInput;", "", "sessionId", "", "verifyTerminalConnectionRequest", "Lai/kudi/agent/transactions/domain/dto/VerifyTerminalConnectionRequest;", "(Ljava/lang/String;Lai/kudi/agent/transactions/domain/dto/VerifyTerminalConnectionRequest;)V", "getSessionId", "()Ljava/lang/String;", "getVerifyTerminalConnectionRequest", "()Lai/kudi/agent/transactions/domain/dto/VerifyTerminalConnectionRequest;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class VerifyTerminalConnectionInput {
        private final String sessionId;
        private final VerifyTerminalConnectionRequest verifyTerminalConnectionRequest;

        public VerifyTerminalConnectionInput(String str, VerifyTerminalConnectionRequest verifyTerminalConnectionRequest) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(verifyTerminalConnectionRequest, "verifyTerminalConnectionRequest");
            this.sessionId = str;
            this.verifyTerminalConnectionRequest = verifyTerminalConnectionRequest;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ VerifyTerminalConnectionInput copy$default(VerifyTerminalConnectionInput verifyTerminalConnectionInput, String $r1, VerifyTerminalConnectionRequest $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = verifyTerminalConnectionInput.sessionId;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = verifyTerminalConnectionInput.verifyTerminalConnectionRequest;
            }
            VerifyTerminalConnectionInput $r0 = verifyTerminalConnectionInput.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.sessionId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final VerifyTerminalConnectionRequest component2() {
            VerifyTerminalConnectionRequest r1 = this.verifyTerminalConnectionRequest;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final VerifyTerminalConnectionInput copy(String str, VerifyTerminalConnectionRequest verifyTerminalConnectionRequest) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(verifyTerminalConnectionRequest, "verifyTerminalConnectionRequest");
            VerifyTerminalConnectionInput $r0 = new VerifyTerminalConnectionInput(str, verifyTerminalConnectionRequest);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof VerifyTerminalConnectionInput;
            if ($z0) {
                VerifyTerminalConnectionInput $r3 = (VerifyTerminalConnectionInput) obj;
                String $r4 = this.sessionId;
                String $r1 = $r3.sessionId;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    VerifyTerminalConnectionRequest $r5 = this.verifyTerminalConnectionRequest;
                    VerifyTerminalConnectionRequest $r6 = $r3.verifyTerminalConnectionRequest;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getSessionId() {
            String r1 = this.sessionId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final VerifyTerminalConnectionRequest getVerifyTerminalConnectionRequest() {
            VerifyTerminalConnectionRequest r1 = this.verifyTerminalConnectionRequest;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.sessionId;
            int $i0 = $r1.hashCode();
            VerifyTerminalConnectionRequest $r2 = this.verifyTerminalConnectionRequest;
            int $i1 = $r2.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("VerifyTerminalConnectionInput(sessionId=");
            String $r1 = this.sessionId;
            $r2.append($r1);
            $r2.append(", verifyTerminalConnectionRequest=");
            VerifyTerminalConnectionRequest $r3 = this.verifyTerminalConnectionRequest;
            $r2.append($r3);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    public VerifyTerminalConnection(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final VerifyTerminalConnectionResponse m41124execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        VerifyTerminalConnectionResponse $r2 = (VerifyTerminalConnectionResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(VerifyTerminalConnectionInput verifyTerminalConnectionInput) {
        Log_OC.getArray(verifyTerminalConnectionInput, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        TerminalApi $r3 = $r2.getTerminalApi();
        String $r4 = verifyTerminalConnectionInput.getSessionId();
        VerifyTerminalConnectionRequest $r5 = verifyTerminalConnectionInput.getVerifyTerminalConnectionRequest();
        AbstractC11688p $r6 = $r3.verifyTerminalRequest($r4, $r5);
        C0605b $r7 = C0605b.f1639e;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        RxSchedulers $r8 = this.rxSchedulers;
        p425j.p444e.Item $r9 = $r8.setSettings();
        AbstractC11688p $r63 = $r62.h0($r9);
        RxSchedulers $r82 = this.rxSchedulers;
        p425j.p444e.Item $r92 = $r82.main();
        AbstractC11688p $r64 = $r63.R($r92);
        Log_OC.loadImage($r64, "networkService.terminalApi.verifyTerminalRequest(\n            input.sessionId,\n            input.verifyTerminalConnectionRequest\n        ).map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        VerifyTerminalConnectionInput $r3 = (VerifyTerminalConnectionInput) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
