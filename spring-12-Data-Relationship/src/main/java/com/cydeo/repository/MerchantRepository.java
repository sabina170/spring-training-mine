package com.cydeo.repository;

import com.cydeo.enity.Merchant;
import com.cydeo.enity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {


}
