package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.settings.domain.repositories.IdtypeRepository;
import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.IdTypesViewModel_Factory */
/* loaded from: classes.dex */
public final class IdTypesViewModel_Factory implements InterfaceC9468d<IdTypesViewModel> {
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;
    private final InterfaceC11700a<IdtypeRepository> idTypeRepositoryProvider;

    public IdTypesViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.idTypeRepositoryProvider = interfaceC11700a;
        this.firebaseDatabaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IdTypesViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        IdTypesViewModel_Factory $r2 = new IdTypesViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IdTypesViewModel newInstance(IdtypeRepository idtypeRepository, C5615f c5615f) {
        IdTypesViewModel $r2 = new IdTypesViewModel(idtypeRepository, c5615f);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IdTypesViewModel multiply() {
        InterfaceC11700a $r1 = this.idTypeRepositoryProvider;
        Object $r2 = $r1.get();
        IdtypeRepository $r3 = (IdtypeRepository) $r2;
        InterfaceC11700a $r12 = this.firebaseDatabaseProvider;
        Object $r22 = $r12.get();
        C5615f $r4 = (C5615f) $r22;
        IdTypesViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40848multiply() {
        IdTypesViewModel $r1 = multiply();
        return $r1;
    }
}
