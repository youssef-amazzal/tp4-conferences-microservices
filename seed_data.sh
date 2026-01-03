#!/bin/bash

# Base URLs (frontend bypasses gateway, hitting services directly)
KEYNOTE_URL="http://localhost:8081/keynotes"
CONFERENCE_URL="http://localhost:8082/conferences"

echo "Seeding data..."

# Create Keynote 1
echo "Creating Keynote 1..."
curl -X POST $KEYNOTE_URL \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "Youssef",
    "lastName": "Amazzal",
    "email": "youssef@example.com",
    "function": "Software Architect"
  }'
echo ""

# Create Keynote 2
echo "Creating Keynote 2..."
curl -X POST $KEYNOTE_URL \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "Souhail",
    "lastName": "Bektachi",
    "email": "souhail@example.com",
    "function": "DevOps Engineer"
  }'
echo ""

# Create Conference 1
echo "Creating Conference 1..."
curl -X POST $CONFERENCE_URL \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Microservices with Spring Boot",
    "type": "Workshop",
    "date": "2026-05-20T09:00:00",
    "duration": 120,
    "inscrites": 0,
    "score": 4.5
  }'
echo ""

# Create Conference 2
echo "Creating Conference 2..."
curl -X POST $CONFERENCE_URL \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Docker & Kubernetes Deep Dive",
    "type": "Talk",
    "date": "2026-06-15T14:30:00",
    "duration": 60,
    "inscrites": 10,
    "score": 4.8
  }'
echo ""

echo "Data seeding complete."
