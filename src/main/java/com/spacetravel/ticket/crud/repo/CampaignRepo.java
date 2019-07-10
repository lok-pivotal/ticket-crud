package com.spacetravel.ticket.crud.repo;

import com.spacetravel.ticket.crud.entity.Campaign;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CampaignRepo extends CrudRepository<Campaign, UUID> {
}
