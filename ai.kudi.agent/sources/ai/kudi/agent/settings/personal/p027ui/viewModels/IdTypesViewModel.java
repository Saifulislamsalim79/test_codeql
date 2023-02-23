package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.domain.repositories.IdtypeRepository;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.IdTypesViewData;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import com.google.firebase.database.InterfaceC5627o;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: IdTypesViewModel.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/IdTypesViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/IdTypesViewData;", "idTypeRepository", "Lai/kudi/agent/settings/domain/repositories/IdtypeRepository;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lai/kudi/agent/settings/domain/repositories/IdtypeRepository;Lcom/google/firebase/database/FirebaseDatabase;)V", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseReference", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabaseReference", "(Lcom/google/firebase/database/DatabaseReference;)V", "firebaseListener", "Lcom/google/firebase/database/ValueEventListener;", "getFirebaseListener", "()Lcom/google/firebase/database/ValueEventListener;", "setFirebaseListener", "(Lcom/google/firebase/database/ValueEventListener;)V", "getAndCacheIdTypes", "", "getIdTypes", "initialData", "onCleared", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.IdTypesViewModel */
/* loaded from: classes.dex */
public final class IdTypesViewModel extends BaseViewModel<IdTypesViewData> {
    private C5612d databaseReference;
    private final C5615f firebaseDatabase;
    private InterfaceC5627o firebaseListener;
    private final IdtypeRepository idTypeRepository;

    public IdTypesViewModel(IdtypeRepository idtypeRepository, C5615f c5615f) {
        Log_OC.getArray(idtypeRepository, "idTypeRepository");
        Log_OC.getArray(c5615f, "firebaseDatabase");
        this.idTypeRepository = idtypeRepository;
        this.firebaseDatabase = c5615f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ IdTypesViewData access$getState(IdTypesViewModel idTypesViewModel) {
        ViewData $r0 = idTypesViewModel.getState();
        IdTypesViewData $r2 = (IdTypesViewData) $r0;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0027 */
    /* renamed from: getIdTypes$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40846getIdTypes$lambda1(ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel r20, java.util.List r21) {
        /*
            java.lang.String r6 = "this$0"
            r0 = r20
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            r0 = r20
            ai.kudi.agent.core.mvvm.ViewData r7 = r0.getState()
            r9 = r7
            ai.kudi.agent.settings.personal.ui.viewModels.data.IdTypesViewData r9 = (ai.kudi.agent.settings.personal.p027ui.viewModels.data.IdTypesViewData) r9
            r8 = r9
            java.lang.String r6 = "list"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r6)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0 = r21
            java.util.Iterator r11 = r0.iterator()
        L23:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L40
            java.lang.Object r13 = r11.next()
            r15 = r13
            ai.kudi.agent.core.domain.room_entities.IdType r15 = (ai.kudi.agent.core.domain.room_entities.IdType) r15
            r14 = r15
            boolean r12 = r14.isAvailable()
            r16 = 1
            r0 = r16
            r12 = r12 ^ r0
            if (r12 == 0) goto L23
            r10.add(r13)
            goto L23
        L40:
            r16 = 0
            r17 = 0
            r18 = 4
            r19 = 0
            r0 = r8
            r1 = r16
            r2 = r10
            r3 = r17
            r4 = r18
            r5 = r19
            ai.kudi.agent.settings.personal.ui.viewModels.data.IdTypesViewData r8 = ai.kudi.agent.settings.personal.p027ui.viewModels.data.IdTypesViewData.copy$default(r0, r1, r2, r3, r4, r5)
            r0 = r20
            r0.publish(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel.m40846getIdTypes$lambda1(ai.kudi.agent.settings.personal.ui.viewModels.IdTypesViewModel, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getAndCacheIdTypes() {
        InterfaceC5627o interfaceC5627o;
        ViewData $r1 = getState();
        IdTypesViewData $r2 = (IdTypesViewData) $r1;
        publish(IdTypesViewData.copy$default($r2, true, null, null, 2, null));
        C5615f $r3 = this.firebaseDatabase;
        C5612d $r4 = $r3.m24316f("idTypes");
        this.databaseReference = $r4;
        if ($r4 == null) {
            interfaceC5627o = null;
        } else {
            interfaceC5627o = new InterfaceC5627o() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.IdTypesViewModel$getAndCacheIdTypes$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // com.google.firebase.database.InterfaceC5627o
                public void onCancelled(C5611c c5611c) {
                    Log_OC.getArray(c5611c, "p0");
                    String $r22 = c5611c.m24329h();
                    Object[] $r32 = new Object[0];
                    Timber.wtf(Log_OC.m10359a("error fetching IdTypes ", (Object) $r22), $r32);
                    IdTypesViewModel $r42 = IdTypesViewModel.this;
                    $r42.getIdTypes();
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* JADX WARN: Incorrect condition in loop: B:4:0x0025 */
                @Override // com.google.firebase.database.InterfaceC5627o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onDataChange(com.google.firebase.database.C5608b r27) {
                    /*
                        r26 = this;
                        java.lang.String r6 = "p0"
                        r0 = r27
                        kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
                        r0 = r27
                        java.lang.Iterable r7 = r0.m24343c()
                        java.lang.String r6 = "p0.children"
                        kotlin.p483e0.p485d.Log_OC.loadImage(r7, r6)
                        java.util.ArrayList r8 = new java.util.ArrayList
                        r10 = 10
                        int r9 = kotlin.p557z.C13722p.m3921o(r7, r10)
                        r8.<init>(r9)
                        java.util.Iterator r11 = r7.iterator()
                    L21:
                        boolean r12 = r11.hasNext()
                        if (r12 == 0) goto L47
                        java.lang.Object r13 = r11.next()
                        r14 = r13
                        com.google.firebase.database.b r14 = (com.google.firebase.database.C5608b) r14
                        r27 = r14
                        java.lang.Class<ai.kudi.agent.core.domain.room_entities.IdType> r15 = ai.kudi.agent.core.domain.room_entities.IdType.class
                        r0 = r27
                        java.lang.Object r13 = r0.m24339g(r15)
                        kotlin.p483e0.p485d.Log_OC.append(r13)
                        r17 = r13
                        ai.kudi.agent.core.domain.room_entities.IdType r17 = (ai.kudi.agent.core.domain.room_entities.IdType) r17
                        r16 = r17
                        r0 = r16
                        r8.add(r0)
                        goto L21
                    L47:
                        java.lang.String r6 = "idTypes "
                        java.lang.String r18 = kotlin.p483e0.p485d.Log_OC.m10359a(r6, r8)
                        r10 = 0
                        java.lang.Object[] r0 = new java.lang.Object[r10]
                        r19 = r0
                        r0 = r18
                        r1 = r19
                        p590o.p591a.Timber.wtf(r0, r1)
                        r0 = r26
                        ai.kudi.agent.settings.personal.ui.viewModels.IdTypesViewModel r0 = ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel.this
                        r20 = r0
                        ai.kudi.agent.settings.domain.repositories.IdtypeRepository r21 = ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel.access$getIdTypeRepository$p(r0)
                        r0 = r21
                        r0.saveIdTypes(r8)
                        r0 = r26
                        ai.kudi.agent.settings.personal.ui.viewModels.IdTypesViewModel r0 = ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel.this
                        r20 = r0
                        ai.kudi.agent.settings.personal.ui.viewModels.data.IdTypesViewData r22 = ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel.access$getState(r0)
                        r10 = 0
                        r23 = 0
                        r24 = 4
                        r25 = 0
                        r0 = r22
                        r1 = r10
                        r2 = r8
                        r3 = r23
                        r4 = r24
                        r5 = r25
                        ai.kudi.agent.settings.personal.ui.viewModels.data.IdTypesViewData r22 = ai.kudi.agent.settings.personal.p027ui.viewModels.data.IdTypesViewData.copy$default(r0, r1, r2, r3, r4, r5)
                        r0 = r20
                        r1 = r22
                        ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel.access$publish(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel$getAndCacheIdTypes$1.onDataChange(com.google.firebase.database.b):void");
                }
            };
            $r4.m24306c(interfaceC5627o);
        }
        this.firebaseListener = interfaceC5627o;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C5612d getDatabaseReference() {
        C5612d r1 = this.databaseReference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC5627o getFirebaseListener() {
        InterfaceC5627o r1 = this.firebaseListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getIdTypes() {
        IdtypeRepository $r2 = this.idTypeRepository;
        AbstractC11293f $r3 = $r2.getIdTypes();
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IdTypesViewModel $r1 = IdTypesViewModel.this;
                List $r32 = (List) obj;
                IdTypesViewModel.m40846getIdTypes$lambda1($r1, $r32);
            }
        };
        HttpStatus $r1 = HttpStatus.SYNCHRONIZED;
        FavoritesArrayAdapter $r5 = $r3.I(object, $r1);
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        IdTypesViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public IdTypesViewData initialData() {
        IdTypesViewData $r1 = new IdTypesViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        C5612d $r2;
        super.onCleared();
        InterfaceC5627o $r1 = this.firebaseListener;
        if ($r1 == null || ($r2 = getDatabaseReference()) == null) {
            return;
        }
        $r2.m24301h($r1);
    }

    public final void setDatabaseReference(C5612d c5612d) {
        this.databaseReference = c5612d;
    }

    public final void setFirebaseListener(InterfaceC5627o interfaceC5627o) {
        this.firebaseListener = interfaceC5627o;
    }
}
