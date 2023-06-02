package com.taibov.kursovaya.repositories;

import com.taibov.kursovaya.entities.Address;
import com.taibov.kursovaya.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long>
{
    Address findAddressByClient(Client client);
}
