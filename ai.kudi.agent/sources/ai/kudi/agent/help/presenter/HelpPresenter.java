package ai.kudi.agent.help.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.help.scalar.usecase.FetchPhoneNumbers;
import ai.kudi.agent.help.views.HelpView;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.Intercom;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HelpPresenter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/help/presenter/HelpPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/help/views/HelpView;", "fetchPhoneNumbers", "Lai/kudi/agent/help/di/usecase/FetchPhoneNumbers;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/help/di/usecase/FetchPhoneNumbers;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "getPhoneNumbers", "logCallEvent", "logChatWithUsEvent", "logFAQEvent", "makePhoneCall", "phoneNumber", "", "navigateToChatLive", "navigateToIssuePage", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "navigateToWebPage", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HelpPresenter extends C9410b<HelpView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchPhoneNumbers fetchPhoneNumbers;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HelpPresenter(FetchPhoneNumbers fetchPhoneNumbers, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(fetchPhoneNumbers, "fetchPhoneNumbers");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchPhoneNumbers = fetchPhoneNumbers;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPhoneNumbers$lambda-3  reason: not valid java name */
    public static final void m39249getPhoneNumbers$lambda3(HelpView helpView) {
        Log_OC.getArray(helpView, "view");
        helpView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPhoneNumbers$lambda-7  reason: not valid java name */
    public static final void m39250getPhoneNumbers$lambda7(HelpPresenter helpPresenter, final List list) {
        Log_OC.getArray(helpPresenter, "this$0");
        C0232b $r2 = C0232b.f330c;
        helpPresenter.ifViewAttached($r2);
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            helpPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.help.presenter.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
                /* renamed from: a */
                public final void mo14809a(Object obj) {
                    List $r1 = list;
                    HelpView $r3 = (HelpView) obj;
                    HelpPresenter.m39253getPhoneNumbers$lambda7$lambda6($r1, $r3);
                }
            });
            return;
        }
        Logger $r3 = Logger.logger;
        helpPresenter.ifViewAttached($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPhoneNumbers$lambda-7$lambda-4  reason: not valid java name */
    public static final void m39251getPhoneNumbers$lambda7$lambda4(HelpView helpView) {
        Log_OC.getArray(helpView, "view");
        helpView.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPhoneNumbers$lambda-7$lambda-5  reason: not valid java name */
    public static final void m39252getPhoneNumbers$lambda7$lambda5(HelpView helpView) {
        Log_OC.getArray(helpView, "it");
        helpView.showMessage("Support contact number is currently not available. Kindly use the chat. Thanks for using Kudi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPhoneNumbers$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39253getPhoneNumbers$lambda7$lambda6(List list, HelpView helpView) {
        Log_OC.getArray(helpView, "it");
        Log_OC.loadImage(list, "phones");
        helpView.showPhoneNumbers(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPhoneNumbers$lambda-9  reason: not valid java name */
    public static final void m39254getPhoneNumbers$lambda9(HelpPresenter helpPresenter, Throwable th) {
        Log_OC.getArray(helpPresenter, "this$0");
        th.printStackTrace();
        Compression $r2 = Compression.METADATA;
        helpPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPhoneNumbers$lambda-9$lambda-8  reason: not valid java name */
    public static final void m39255getPhoneNumbers$lambda9$lambda8(HelpView helpView) {
        Log_OC.getArray(helpView, "view");
        helpView.hideLoading();
        helpView.showMessage("Something went wrong. Kindly refresh the page");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logCallEvent$lambda-10  reason: not valid java name */
    public static final void m39256logCallEvent$lambda10(HelpPresenter helpPresenter, User user) {
        Log_OC.getArray(helpPresenter, "this$0");
        Analytics $r2 = helpPresenter.analytics;
        $r2.onCallUsEvent(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logChatWithUsEvent$lambda-12  reason: not valid java name */
    public static final void m39258logChatWithUsEvent$lambda12(HelpPresenter helpPresenter, User user) {
        Log_OC.getArray(helpPresenter, "this$0");
        Analytics $r2 = helpPresenter.analytics;
        $r2.onSendAMessageEvent(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logFAQEvent$lambda-14  reason: not valid java name */
    public static final void m39260logFAQEvent$lambda14(HelpPresenter helpPresenter, User user) {
        Log_OC.getArray(helpPresenter, "this$0");
        Analytics $r2 = helpPresenter.analytics;
        $r2.onClickFAQ(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: makePhoneCall$lambda-2  reason: not valid java name */
    public static final void m39262makePhoneCall$lambda2(String str, HelpView helpView) {
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(helpView, "it");
        helpView.makeACall(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToIssuePage$lambda-0  reason: not valid java name */
    public static final void m39263navigateToIssuePage$lambda0(IssueTypeModel issueTypeModel, HelpView helpView) {
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Log_OC.getArray(helpView, "it");
        helpView.navigateToSubmitIssue(issueTypeModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToWebPage$lambda-1  reason: not valid java name */
    public static final void m39264navigateToWebPage$lambda1(String str, HelpView helpView) {
        Log_OC.getArray(str, "$url");
        Log_OC.getArray(helpView, "it");
        helpView.openFaqWebPage(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getPhoneNumbers() {
        C0234f $r2 = C0234f.f332o;
        ifViewAttached($r2);
        FetchPhoneNumbers $r3 = this.fetchPhoneNumbers;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.help.presenter.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HelpPresenter $r1 = HelpPresenter.this;
                List $r32 = (List) obj;
                HelpPresenter.m39250getPhoneNumbers$lambda7($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.help.presenter.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HelpPresenter $r1 = HelpPresenter.this;
                Throwable $r32 = (Throwable) obj;
                HelpPresenter.m39254getPhoneNumbers$lambda9($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "fetchPhoneNumbers.execute()\n            .subscribe(\n                { phones ->\n\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                    }\n\n                    if (phones.isEmpty()) {\n                        ifViewAttached {\n                            it.showMessage(\n                                \"Support contact number is currently not available.\" +\n                                        \" Kindly use the chat. Thanks for using Kudi\"\n                            )\n                        }\n                    } else {\n                        ifViewAttached { it.showPhoneNumbers(phones) }\n                    }\n                }, { err ->\n                    err.printStackTrace()\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                        view.showMessage(\"Something went wrong. Kindly refresh the page\")\n                    }\n                })");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logCallEvent() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        p425j.p444e.Item $r3 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        p425j.p444e.Item $r32 = ContextUtils.LogError();
        AbstractC11696w $r23 = $r22.n($r32);
        Object object = new Object() { // from class: ai.kudi.agent.help.presenter.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HelpPresenter $r12 = HelpPresenter.this;
                User $r33 = (User) obj;
                HelpPresenter.m39256logCallEvent$lambda10($r12, $r33);
            }
        };
        Chunk $r5 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r6 = $r23.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onCallUsEvent(it)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logChatWithUsEvent() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        p425j.p444e.Item $r3 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        p425j.p444e.Item $r32 = ContextUtils.LogError();
        AbstractC11696w $r23 = $r22.n($r32);
        Object object = new Object() { // from class: ai.kudi.agent.help.presenter.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HelpPresenter $r12 = HelpPresenter.this;
                User $r33 = (User) obj;
                HelpPresenter.m39258logChatWithUsEvent$lambda12($r12, $r33);
            }
        };
        FormatedText $r5 = FormatedText.SINGLE_SPACE;
        FavoritesArrayAdapter $r6 = $r23.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onSendAMessageEvent(it)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logFAQEvent() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        p425j.p444e.Item $r3 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        p425j.p444e.Item $r32 = ContextUtils.LogError();
        AbstractC11696w $r23 = $r22.n($r32);
        Object object = new Object() { // from class: ai.kudi.agent.help.presenter.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HelpPresenter $r12 = HelpPresenter.this;
                User $r33 = (User) obj;
                HelpPresenter.m39260logFAQEvent$lambda14($r12, $r33);
            }
        };
        Token $r5 = Token.BOOL;
        FavoritesArrayAdapter $r6 = $r23.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onClickFAQ(it)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void makePhoneCall(final String str) {
        Log_OC.getArray(str, "phoneNumber");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.help.presenter.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                String $r1 = str;
                HelpView $r3 = (HelpView) obj;
                HelpPresenter.m39262makePhoneCall$lambda2($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToChatLive() {
        Intercom $r1 = Intercom.client();
        $r1.displayMessageComposer();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToIssuePage(final IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.help.presenter.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void read(Object obj) {
                IssueTypeModel $r1 = IssueTypeModel.this;
                HelpView $r3 = (HelpView) obj;
                HelpPresenter.m39263navigateToIssuePage$lambda0($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToWebPage(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.help.presenter.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r1 = str;
                HelpView $r3 = (HelpView) obj;
                HelpPresenter.m39264navigateToWebPage$lambda1($r1, $r3);
            }
        });
    }
}
