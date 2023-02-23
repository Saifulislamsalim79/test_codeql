package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.AssociatedFieldRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: AssociatedField.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;", "", "associatedFieldRepository", "Lai/kudi/agent/v2/common/domain/repositories/AssociatedFieldRepository;", "(Lai/kudi/agent/v2/common/domain/repositories/AssociatedFieldRepository;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/AssociatedFieldsResponseBody;", "id", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.AssociatedField */
/* loaded from: classes.dex */
public final class AssociatedField {
    private final AssociatedFieldRepository associatedFieldRepository;

    public AssociatedField(AssociatedFieldRepository associatedFieldRepository) {
        Log_OC.getArray(associatedFieldRepository, "associatedFieldRepository");
        this.associatedFieldRepository = associatedFieldRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "id");
        AssociatedFieldRepository $r3 = this.associatedFieldRepository;
        AbstractC11688p $r1 = $r3.getAssociatedField(str);
        return $r1;
    }
}
