package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.data.OutletParent;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletParent;
import ai.kudi.agent.settings.domain.useCases.GetMonthlyKycLevels;
import ai.kudi.agent.settings.domain.useCases.Profile;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: PersonalViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u0007\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData;", "profile", "Lai/kudi/agent/settings/domain/useCases/Profile;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchParentDetails", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletParent;", "sharedPreferences", "Lai/kudi/agent/core/util/Pref;", "getKycLevels", "Lai/kudi/agent/settings/domain/useCases/GetMonthlyKycLevels;", "(Lai/kudi/agent/settings/domain/useCases/Profile;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/outlet_mgt/useCases/FetchOutletParent;Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/settings/domain/useCases/GetMonthlyKycLevels;)V", "", "findKycLevel", "kycLevel", "", "getIsReviewingRequest", "", "getProfile", "initialData", "isProfileInComplete", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", OpsMetricTracker.START, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.PersonalViewModel */
/* loaded from: classes.dex */
public final class PersonalViewModel extends BaseViewModel<PersonalViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchOutletParent fetchParentDetails;
    private final GetMonthlyKycLevels getKycLevels;
    private final Profile profile;
    private final Pref sharedPreferences;

    public PersonalViewModel(Profile profile, FetchCurrentUser fetchCurrentUser, FetchOutletParent fetchOutletParent, Pref pref, GetMonthlyKycLevels getMonthlyKycLevels) {
        Log_OC.getArray(profile, "profile");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchOutletParent, "fetchParentDetails");
        Log_OC.getArray(pref, "sharedPreferences");
        Log_OC.getArray(getMonthlyKycLevels, "getKycLevels");
        this.profile = profile;
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchParentDetails = fetchOutletParent;
        this.sharedPreferences = pref;
        this.getKycLevels = getMonthlyKycLevels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchParentDetails$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40849fetchParentDetails$lambda0(PersonalViewModel personalViewModel, User user) {
        Log_OC.getArray(personalViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchOutletParent $r2 = personalViewModel.fetchParentDetails;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchParentDetails$lambda-1  reason: not valid java name */
    public static final void m40850fetchParentDetails$lambda1(PersonalViewModel personalViewModel, OutletParent outletParent) {
        Log_OC.getArray(personalViewModel, "this$0");
        ViewData $r2 = personalViewModel.getState();
        PersonalViewData $r3 = (PersonalViewData) $r2;
        personalViewModel.publish(PersonalViewData.copy$default($r3, false, null, false, null, null, null, false, null, outletParent, 254, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchParentDetails$lambda-2  reason: not valid java name */
    public static final void m40851fetchParentDetails$lambda2(PersonalViewModel personalViewModel, Throwable th) {
        Log_OC.getArray(personalViewModel, "this$0");
        ViewData $r2 = personalViewModel.getState();
        PersonalViewData $r3 = (PersonalViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Couldn't Fetch Parent Outlet", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        PersonalViewData.Error $r4 = new PersonalViewData.Error(null, null, null, (String) $r6, 7, null);
        personalViewModel.publish(PersonalViewData.copy$default($r3, false, null, false, null, null, $r4, false, null, null, 479, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void findKycLevel(final String str) {
        ViewData $r2 = getState();
        PersonalViewData $r3 = (PersonalViewData) $r2;
        publish(PersonalViewData.copy$default($r3, false, null, false, null, null, null, true, null, null, 319, null));
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PersonalViewModel $r1 = PersonalViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PersonalViewModel.m40852findKycLevel$lambda6($r1, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Cubic
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalViewModel $r1 = PersonalViewModel.this;
                String $r22 = str;
                List $r42 = (List) obj;
                PersonalViewModel.m40853findKycLevel$lambda8($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalViewModel $r1 = PersonalViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PersonalViewModel.m40854findKycLevel$lambda9($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: findKycLevel$lambda-6  reason: not valid java name */
    public static final InterfaceC11692s m40852findKycLevel$lambda6(PersonalViewModel personalViewModel, User user) {
        Log_OC.getArray(personalViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetMonthlyKycLevels $r2 = personalViewModel.getKycLevels;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: findKycLevel$lambda-8  reason: not valid java name */
    public static final void m40853findKycLevel$lambda8(PersonalViewModel personalViewModel, String str, List list) {
        KycLevelsModel kycLevelsModel;
        Log_OC.getArray(personalViewModel, "this$0");
        Log_OC.getArray(str, "$kycLevel");
        ViewData $r3 = personalViewModel.getState();
        PersonalViewData $r4 = (PersonalViewData) $r3;
        Log_OC.loadImage(list, AttributeType.LIST);
        Iterator $r5 = list.iterator();
        while (true) {
            boolean $z0 = $r5.hasNext();
            if (!$z0) {
                kycLevelsModel = null;
                break;
            }
            Object $r6 = $r5.next();
            kycLevelsModel = $r6;
            String $r9 = ((KycLevelsModel) $r6).getKycLevel();
            boolean $z02 = Log_OC.append($r9, str);
            if ($z02) {
                break;
            }
        }
        personalViewModel.publish(PersonalViewData.copy$default($r4, false, null, false, null, null, null, false, kycLevelsModel, null, 319, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: findKycLevel$lambda-9  reason: not valid java name */
    public static final void m40854findKycLevel$lambda9(PersonalViewModel personalViewModel, Throwable th) {
        Log_OC.getArray(personalViewModel, "this$0");
        PersonalViewData.Error $r2 = new PersonalViewData.Error(null, null, "Unable to fetch kyc details", null, 11, null);
        ViewData $r3 = personalViewModel.getState();
        PersonalViewData $r4 = PersonalViewData.copy$default((PersonalViewData) $r3, false, null, false, null, null, $r2, false, null, null, 415, null);
        personalViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProfile$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m40855getProfile$lambda3(PersonalViewModel personalViewModel, User user) {
        Log_OC.getArray(personalViewModel, "this$0");
        Log_OC.getArray(user, "it");
        Profile $r3 = personalViewModel.profile;
        AbstractC11688p $r1 = $r3.execute(user);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProfile$lambda-4  reason: not valid java name */
    public static final void m40856getProfile$lambda4(PersonalViewModel personalViewModel, UserProfile userProfile) {
        Log_OC.getArray(personalViewModel, "this$0");
        ViewData $r2 = personalViewModel.getState();
        PersonalViewData $r3 = (PersonalViewData) $r2;
        personalViewModel.publish(PersonalViewData.copy$default($r3, false, null, false, null, userProfile, null, false, null, null, 494, null));
        String $r4 = userProfile.getKycLevel();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        personalViewModel.findKycLevel($r5);
        Log_OC.loadImage(userProfile, "it");
        personalViewModel.isProfileInComplete(userProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProfile$lambda-5  reason: not valid java name */
    public static final void m40857getProfile$lambda5(PersonalViewModel personalViewModel, Throwable th) {
        Log_OC.getArray(personalViewModel, "this$0");
        String $r2 = th.getMessage();
        Object[] $r3 = new Object[0];
        Timber.m1627e(Log_OC.m10359a("error Fetching profile ", (Object) $r2), $r3);
        ViewData $r4 = personalViewModel.getState();
        InterfaceC11767l $r7 = KudiErrorParserKt.parseHttpError2$default("Couldn't fetch profile Or KYC details", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r8 = $r7.invoke(th);
        String $r22 = (String) $r8;
        PersonalViewData.Error $r6 = new PersonalViewData.Error($r22, null, null, null, 14, null);
        PersonalViewData $r5 = PersonalViewData.copy$default((PersonalViewData) $r4, false, null, false, null, null, $r6, false, null, null, 478, null);
        personalViewModel.publish($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005f, code lost:
        if (r17 != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void isProfileInComplete(ai.kudi.agent.core.domain.room_entities.UserProfile r35) {
        /*
            r34 = this;
            r13 = 8
            java.lang.String[] r12 = new java.lang.String[r13]
            r0 = r35
            java.lang.String r14 = r0.getBusinessAddress()
            r15 = 0
            r13 = 0
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getLastName()
            r13 = 1
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getFirstName()
            r13 = 2
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getState()
            r13 = 3
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getEmail()
            r13 = 4
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getLga()
            r13 = 5
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getBvn()
            r13 = 6
            r12[r13] = r14
            r0 = r35
            java.lang.String r14 = r0.getBusinessName()
            r13 = 7
            r12[r13] = r14
            java.util.List r16 = kotlin.p557z.C13722p.m3935h(r12)
            r0 = r16
            boolean r0 = r0 instanceof java.util.Collection
            r17 = r0
            if (r17 == 0) goto L62
            r0 = r16
            boolean r17 = r0.isEmpty()
            if (r17 == 0) goto L62
            goto L8d
        L62:
            r0 = r16
            java.util.Iterator r18 = r0.iterator()
        L68:
            r0 = r18
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L8d
            r0 = r18
            java.lang.Object r19 = r0.next()
            r20 = r19
            java.lang.String r20 = (java.lang.String) r20
            r14 = r20
            if (r14 == 0) goto L88
            boolean r17 = kotlin.p549l0.C13265j.m5470u(r14)
            if (r17 == 0) goto L85
            goto L88
        L85:
            r17 = 0
            goto L8a
        L88:
            r17 = 1
        L8a:
            if (r17 == 0) goto L68
            r15 = 1
        L8d:
            r0 = r34
            ai.kudi.agent.core.mvvm.ViewData r21 = r0.getState()
            r23 = r21
            ai.kudi.agent.settings.personal.ui.viewModels.data.PersonalViewData r23 = (ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData) r23
            r22 = r23
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r15)
            r13 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 503(0x1f7, float:7.05E-43)
            r33 = 0
            r0 = r22
            r1 = r13
            r2 = r25
            r3 = r26
            r4 = r24
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            ai.kudi.agent.settings.personal.ui.viewModels.data.PersonalViewData r22 = ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r34
            r1 = r22
            r0.publish(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.PersonalViewModel.isProfileInComplete(ai.kudi.agent.core.domain.room_entities.UserProfile):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchParentDetails() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PersonalViewModel $r12 = PersonalViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PersonalViewModel.m40849fetchParentDetails$lambda0($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalViewModel $r12 = PersonalViewModel.this;
                OutletParent $r3 = (OutletParent) obj;
                PersonalViewModel.m40850fetchParentDetails$lambda1($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalViewModel $r12 = PersonalViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PersonalViewModel.m40851fetchParentDetails$lambda2($r12, $r3);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getIsReviewingRequest() {
        Pref $r1 = this.sharedPreferences;
        boolean $z0 = $r1.getKycInReview();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getProfile() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PersonalViewModel $r12 = PersonalViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PersonalViewModel.m40855getProfile$lambda3($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Profile
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalViewModel $r12 = PersonalViewModel.this;
                UserProfile $r3 = (UserProfile) obj;
                PersonalViewModel.m40856getProfile$lambda4($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalViewModel $r12 = PersonalViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PersonalViewModel.m40857getProfile$lambda5($r12, $r3);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PersonalViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PersonalViewData initialData() {
        PersonalViewData $r1 = new PersonalViewData(false, null, false, null, null, null, false, null, null, 398, null);
        return $r1;
    }

    public final void start() {
        getProfile();
    }
}
