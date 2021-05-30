package local.open_banking.demo.io.repository;

import java.util.Optional;

public interface MerchantDetailsRepository {
    Optional<String> findMerchantLogo(final String merchantName);
}
