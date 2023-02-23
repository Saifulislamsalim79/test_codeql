package ai.kudi.agent.transactions.viewmodels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.dto.SendReceiptsToTerminalRequest;
import ai.kudi.agent.transactions.domain.dto.TerminalConnectionResponse;
import ai.kudi.agent.transactions.domain.dto.TerminalReceiptResponse;
import ai.kudi.agent.transactions.domain.dto.VerifyTerminalConnectionRequest;
import ai.kudi.agent.transactions.domain.dto.VerifyTerminalConnectionResponse;
import ai.kudi.agent.transactions.domain.usecases.SendReceiptToTerminal;
import ai.kudi.agent.transactions.domain.usecases.VerifyTerminalConnection;
import ai.kudi.agent.transactions.viewmodels.data.SendReceiptToTerminalViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: SendReceiptToTerminalViewModel.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0002J&\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/transactions/viewmodels/SendReceiptToTerminalViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/transactions/viewmodels/data/SendReceiptToTerminalViewData;", "sendReceiptToTerminal", "Lai/kudi/agent/transactions/domain/usecases/SendReceiptToTerminal;", "verifyTerminalConnection", "Lai/kudi/agent/transactions/domain/usecases/VerifyTerminalConnection;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "resourceDelegate", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/transactions/domain/usecases/SendReceiptToTerminal;Lai/kudi/agent/transactions/domain/usecases/VerifyTerminalConnection;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/util/ResourceDelegate;)V", "initialData", "sendReceipt", "", "connectionResponse", "Lai/kudi/agent/transactions/domain/dto/TerminalConnectionResponse;", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "verifyConnectionAndSendReceipt", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SendReceiptToTerminalViewModel extends BaseViewModel<SendReceiptToTerminalViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final ResourceDelegate resourceDelegate;
    private final SendReceiptToTerminal sendReceiptToTerminal;
    private final VerifyTerminalConnection verifyTerminalConnection;

    public SendReceiptToTerminalViewModel(SendReceiptToTerminal sendReceiptToTerminal, VerifyTerminalConnection verifyTerminalConnection, FetchCurrentUser fetchCurrentUser, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(sendReceiptToTerminal, "sendReceiptToTerminal");
        Log_OC.getArray(verifyTerminalConnection, "verifyTerminalConnection");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(resourceDelegate, "resourceDelegate");
        this.sendReceiptToTerminal = sendReceiptToTerminal;
        this.verifyTerminalConnection = verifyTerminalConnection;
        this.fetchCurrentUser = fetchCurrentUser;
        this.resourceDelegate = resourceDelegate;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void sendReceipt(final TerminalConnectionResponse terminalConnectionResponse, final HashMap hashMap) {
        SendReceiptToTerminalViewData.Loading $r3 = SendReceiptToTerminalViewData.Loading.INSTANCE;
        publish($r3);
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.viewmodels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SendReceiptToTerminalViewModel $r1 = SendReceiptToTerminalViewModel.this;
                HashMap $r2 = hashMap;
                TerminalConnectionResponse $r32 = terminalConnectionResponse;
                User $r6 = (User) obj;
                InterfaceC11692s $r42 = SendReceiptToTerminalViewModel.m41272sendReceipt$lambda3($r1, $r2, $r32, $r6);
                return $r42;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.transactions.viewmodels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SendReceiptToTerminalViewModel $r1 = SendReceiptToTerminalViewModel.this;
                TerminalReceiptResponse $r32 = (TerminalReceiptResponse) obj;
                SendReceiptToTerminalViewModel.m41273sendReceipt$lambda4($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.viewmodels.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SendReceiptToTerminalViewModel $r1 = SendReceiptToTerminalViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SendReceiptToTerminalViewModel.m41274sendReceipt$lambda5($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendReceipt$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m41272sendReceipt$lambda3(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel, HashMap hashMap, TerminalConnectionResponse terminalConnectionResponse, User user) {
        String $r8;
        String $r13;
        Log_OC.getArray(sendReceiptToTerminalViewModel, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        Log_OC.getArray(terminalConnectionResponse, "$connectionResponse");
        Log_OC.getArray(user, "it");
        SendReceiptToTerminal $r5 = sendReceiptToTerminalViewModel.sendReceiptToTerminal;
        Set $r7 = hashMap.keySet();
        Log_OC.loadImage($r7, "transaction.keys");
        $r8 = C13742z.m3797a0($r7, "|", null, null, 0, null, null, 62, null);
        String $r9 = terminalConnectionResponse.getSerialNumber();
        if ($r9 == null) {
            $r9 = "";
        }
        String $r10 = terminalConnectionResponse.getSessionId();
        String $r11 = $r10;
        if ($r10 == null) {
            $r11 = "";
        }
        String $r102 = user.getTerminalId();
        Log_OC.loadImage($r102, "it.terminalId");
        Collection $r12 = hashMap.values();
        Log_OC.loadImage($r12, "transaction.values");
        $r13 = C13742z.m3797a0($r12, "|", null, null, 0, null, null, 62, null);
        SendReceiptsToTerminalRequest $r4 = new SendReceiptsToTerminalRequest($r8, $r9, $r11, $r102, $r13);
        String $r82 = user.getSessionId();
        Log_OC.loadImage($r82, "it.sessionId");
        SendReceiptToTerminal.SendReceiptToTerminalInput $r6 = new SendReceiptToTerminal.SendReceiptToTerminalInput($r4, $r82);
        AbstractC11688p $r14 = $r5.execute($r6);
        return $r14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendReceipt$lambda-4  reason: not valid java name */
    public static final void m41273sendReceipt$lambda4(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel, TerminalReceiptResponse terminalReceiptResponse) {
        Log_OC.getArray(sendReceiptToTerminalViewModel, "this$0");
        Log_OC.loadImage(terminalReceiptResponse, "it");
        SendReceiptToTerminalViewData.ReceiptSent $r2 = new SendReceiptToTerminalViewData.ReceiptSent(terminalReceiptResponse);
        sendReceiptToTerminalViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendReceipt$lambda-5  reason: not valid java name */
    public static final void m41274sendReceipt$lambda5(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel, Throwable th) {
        Log_OC.getArray(sendReceiptToTerminalViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        SendReceiptToTerminalViewData.Error $r2 = new SendReceiptToTerminalViewData.Error($r5);
        sendReceiptToTerminalViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyConnectionAndSendReceipt$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41275verifyConnectionAndSendReceipt$lambda0(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel, TerminalConnectionResponse terminalConnectionResponse, User user) {
        Log_OC.getArray(sendReceiptToTerminalViewModel, "this$0");
        Log_OC.getArray(terminalConnectionResponse, "$connectionResponse");
        Log_OC.getArray(user, "it");
        VerifyTerminalConnection $r3 = sendReceiptToTerminalViewModel.verifyTerminalConnection;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        String $r7 = terminalConnectionResponse.getSerialNumber();
        String $r8 = terminalConnectionResponse.getSessionId();
        String $r9 = user.getTerminalId();
        VerifyTerminalConnectionRequest $r6 = new VerifyTerminalConnectionRequest($r7, $r8, $r9);
        VerifyTerminalConnection.VerifyTerminalConnectionInput $r4 = new VerifyTerminalConnection.VerifyTerminalConnectionInput($r5, $r6);
        AbstractC11688p $r10 = $r3.execute($r4);
        return $r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyConnectionAndSendReceipt$lambda-1  reason: not valid java name */
    public static final void m41276verifyConnectionAndSendReceipt$lambda1(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel, TerminalConnectionResponse terminalConnectionResponse, HashMap hashMap, VerifyTerminalConnectionResponse verifyTerminalConnectionResponse) {
        Log_OC.getArray(sendReceiptToTerminalViewModel, "this$0");
        Log_OC.getArray(terminalConnectionResponse, "$connectionResponse");
        Log_OC.getArray(hashMap, "$transaction");
        boolean $z0 = verifyTerminalConnectionResponse.getSessionExpired();
        if ($z0) {
            SendReceiptToTerminalViewData.HideLoading $r4 = SendReceiptToTerminalViewData.HideLoading.INSTANCE;
            sendReceiptToTerminalViewModel.publish($r4);
            ResourceDelegate $r6 = sendReceiptToTerminalViewModel.resourceDelegate;
            String $r7 = $r6.getString(C0001R.string.terminal_session_expired);
            SendReceiptToTerminalViewData.Error $r5 = new SendReceiptToTerminalViewData.Error($r7);
            sendReceiptToTerminalViewModel.publish($r5);
            return;
        }
        boolean $z02 = verifyTerminalConnectionResponse.getConnected();
        if ($z02) {
            sendReceiptToTerminalViewModel.sendReceipt(terminalConnectionResponse, hashMap);
            return;
        }
        SendReceiptToTerminalViewData.HideLoading $r42 = SendReceiptToTerminalViewData.HideLoading.INSTANCE;
        sendReceiptToTerminalViewModel.publish($r42);
        ResourceDelegate $r62 = sendReceiptToTerminalViewModel.resourceDelegate;
        String $r72 = $r62.getString(C0001R.string.terminal_not_connected);
        SendReceiptToTerminalViewData.Error $r52 = new SendReceiptToTerminalViewData.Error($r72);
        sendReceiptToTerminalViewModel.publish($r52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyConnectionAndSendReceipt$lambda-2  reason: not valid java name */
    public static final void m41277verifyConnectionAndSendReceipt$lambda2(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel, Throwable th) {
        Log_OC.getArray(sendReceiptToTerminalViewModel, "this$0");
        SendReceiptToTerminalViewData.HideLoading $r2 = SendReceiptToTerminalViewData.HideLoading.INSTANCE;
        sendReceiptToTerminalViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        SendReceiptToTerminalViewData.Error $r3 = new SendReceiptToTerminalViewData.Error($r6);
        sendReceiptToTerminalViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SendReceiptToTerminalViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SendReceiptToTerminalViewData initialData() {
        SendReceiptToTerminalViewData.Initial r1 = SendReceiptToTerminalViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyConnectionAndSendReceipt(final TerminalConnectionResponse terminalConnectionResponse, final HashMap hashMap) {
        Log_OC.getArray(terminalConnectionResponse, "connectionResponse");
        Log_OC.getArray(hashMap, "transaction");
        SendReceiptToTerminalViewData.Loading $r3 = SendReceiptToTerminalViewData.Loading.INSTANCE;
        publish($r3);
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.viewmodels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SendReceiptToTerminalViewModel $r1 = SendReceiptToTerminalViewModel.this;
                TerminalConnectionResponse $r2 = terminalConnectionResponse;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = SendReceiptToTerminalViewModel.m41275verifyConnectionAndSendReceipt$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.transactions.viewmodels.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SendReceiptToTerminalViewModel $r1 = SendReceiptToTerminalViewModel.this;
                TerminalConnectionResponse $r2 = terminalConnectionResponse;
                HashMap $r32 = hashMap;
                VerifyTerminalConnectionResponse $r52 = (VerifyTerminalConnectionResponse) obj;
                SendReceiptToTerminalViewModel.m41276verifyConnectionAndSendReceipt$lambda1($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.viewmodels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SendReceiptToTerminalViewModel $r1 = SendReceiptToTerminalViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SendReceiptToTerminalViewModel.m41277verifyConnectionAndSendReceipt$lambda2($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }
}
