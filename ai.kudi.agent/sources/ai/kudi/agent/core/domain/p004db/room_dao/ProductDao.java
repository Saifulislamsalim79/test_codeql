package ai.kudi.agent.core.domain.p004db.room_dao;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11696w;
/* compiled from: BillerDao.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/ProductDao;", "", "fetchProducts", "Lio/reactivex/Single;", "", "Lai/kudi/agent/bills/data/Product;", "billerId", "", "saveProducts", "", "products", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.ProductDao */
/* loaded from: classes.dex */
public interface ProductDao {
    AbstractC11696w fetchProducts();

    AbstractC11696w fetchProducts(String str);

    AbstractC11696w saveProducts(List list);
}
